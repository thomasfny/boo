package edu.qc.seclass.glm;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

/*
    This class acts as a Data Access Object to interact between the user, the database and her tables.
 */
@Dao
public interface DatabaseAccessObject
{


    @Insert
    public void addItem(Item groceryItem);      //Add an item into the Room database object



    @Query("select * from groceryItems")
    public List<Item> getItems();   //Lists out all of the items in the database.

    @Query("select * from groceryCategories")
    public List<Category> getCategories();  //Lists out all of the categories in the database.







    @Delete
    public void deleteCategory(Category category);  //Never used for this application.

    @Delete
    public void deleteItem(Item item);  //Never used for this application.
}
