package edu.qc.seclass.glm;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*
    Creating the grocery category entity (table).
    Defining what goes into the table.
    Defines the getter and setters.
    Declarators will define the Primary Key and the Info for non-Primary-Key Columns.
 */

@Entity(tableName = "groceryCategories")    //Table has alias groceryCategories.
public class Category
{


    @PrimaryKey     //each grocery category has a identifier key.
    private int id;


    @ColumnInfo(name = "category_name")     //each grocery category has a unique alias name
    private String categoryName;




    /*
        Getters
        and
        Setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
