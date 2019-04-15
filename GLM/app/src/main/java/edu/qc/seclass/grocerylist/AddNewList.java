package edu.qc.seclass.grocerylist;;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import edu.qc.seclass.grocerylist.dbms;

//page for add new list
public class AddNewList extends AppCompatActivity {

    private Button submitButton;
    DataAccess dataAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_list);
        //set up database
        dataAccess = DataAccess.getInstance(this);
        submitButton =(Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText list = (EditText) findViewById(R.id.NewList);
                String name = list.getText().toString();

                if(name.equals("")){
                    Toast.makeText(AddNewList.this,"please enter a name",Toast.LENGTH_LONG).show();
                }
                else{
                    boolean test= dataAccess.insertList(name);
                    if(!test){
                        Toast.makeText(AddNewList.this,"List not created or name has been used",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Intent intent = new Intent();
                        intent.putExtra("ListName",name);
                        setResult(RESULT_OK,intent);
                        finish();
                    }
                }

            }
        });
    }


    //back to preview page icon
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.home:
                Intent intent = new Intent();
                intent.putExtra("ListName","");
                setResult(RESULT_CANCELED,intent);
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
