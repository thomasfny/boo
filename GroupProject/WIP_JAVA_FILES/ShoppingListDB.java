package edu.qc.seclass.glm;

import androidx.room.Database;
import androidx.room.RoomDatabase;


/*
    Abstract class for the actual ShoppingList Database.
    Extended with RoomDatabase to be used.
 */


@Database(entities = {Category.class, Item.class}, version = 1) //Database contains two tables. The Category and Item Table classes and the version of the DB is 1.
public abstract class ShoppingListDB extends RoomDatabase
{

    public abstract DatabaseAccessObject thisDataAccessObject();


}
