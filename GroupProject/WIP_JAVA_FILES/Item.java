package edu.qc.seclass.glm;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/*
    Creating the grocery item entity (table).
    Defining what goes into the table of items.
    Defines the getter and setters for the items.
    Declarators will define the Primary Key and the Info for non-Primary-Key Columns.
 */

@Entity(tableName = "groceryItems") //Table has alias groceryItems.
public class Item
{


    @PrimaryKey     //each grocery item has a identifier key.
    private int itemID;

    @ForeignKey(entity = Category.class, parentColumns = "id", childColumns = "itemID") //Declares Foreign key on Category ID.
    private int catID;

    @ColumnInfo(name = "item_name")     //each grocery item has a unique alias name
    private String itemName;




    /*
        Getters
        and
        Setters
     */

    public int getCatID() { return catID; }

    public void setCatID(int catID) { this.catID = catID; }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}



