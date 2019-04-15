package edu.qc.seclass.grocerylist;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Result extends AppCompatActivity {
    List<Item> itemList;
    ListView listView;
    resultAdapter resultAdapter;
    String type;
    String name;
    int typeID;
    int index;// position for type list
    int position;//position for item list
    DataAccess dataAccess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        int result=0;
        super.onCreate(savedInstanceState);
        dataAccess = DataAccess.getInstance(this);
        Intent intent = getIntent();
        type = intent.getStringExtra("type");
        name = intent.getStringExtra("searchName");
        position = intent.getIntExtra("position", -1);
        typeID = intent.getIntExtra("id", -1);
        if (type.equals("Type")) {
            itemList = dataAccess.getitemTypeList(typeID);
        }else {
            itemList = dataAccess.getproductList(name);
        }
        if (itemList.size() == 0) {
            setContentView(R.layout.result_not_found);
            Button createNew = (Button) findViewById(R.id.CreateNewItem);
            createNew.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), createNew.class);
                    intent.putExtra("position", position); //to find which list has been click
                    intent.putExtra("type", type);
                    intent.putExtra("searchName", name);
                    startActivity(intent);

                }
            });
        } else {
            setContentView(R.layout.activity_result);

            setTitle(name);
            listView = (ListView) findViewById(R.id.resultList);


            resultAdapter = new resultAdapter(Result.this, itemList);
            listView.setAdapter(resultAdapter);


            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    index = i;
                    startActivityForResult(new Intent(getApplicationContext(), addItem.class), 2);
                }
            });

            Button createNew = (Button) findViewById(R.id.CreateNewItem);
            createNew.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), createNew.class);
                    intent.putExtra("position", position); //to find which list has been click
                    intent.putExtra("type", type);
                    intent.putExtra("searchName", name);
                    startActivity(intent);
                }
            });
        }

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 2 && resultCode == RESULT_OK){
            Item p = itemList.get(index);
            int itemID = p.getId();
            String amount=(String)data.getStringExtra("amount");
            boolean result = dataAccess.inserItem(position,itemID,amount);
            if(!result){
                Toast.makeText(Result.this,"Item may already be in list.",Toast.LENGTH_LONG).show();
            }

        }
    }


    //back to preview page icon
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.imageButton:
                Intent intent = new Intent(Result.this,Search.class);
                intent.putExtra("position",position);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    //button on action bar plug in
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_back,menu);
        return true;
    }
}
