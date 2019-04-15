1. A grocery list consists of items the users want to buy at a grocery store. The application must allow users to add items to a list, delete items from a list, and change the quantity of items in the list (e.g., change from one to two pounds of apples).
  * A "GroceryList" class is defined, this uses the attribute "ItemsList", which is an array of "Items", as well as a method to "AddItem()" and "RemoveItem()".

  * The quantity of an Item can be changed by the "Item" class, which contains an attribute, "ItemQuantity" and a "ChangeQuantity" method. Assuming the user only wants whole numbered changes, i.e. 5 pounds of apples as opposed to 5 and a half pounds.
	
2. The application must contain a database (DB) of  items  and corresponding  item types.
  * A "Database" class is defined with attributes "ItemType" and "ItemName", both are string type, sharing a relation with the "Item" class. 
    
3. Users must be able to add items to a list by picking them from a hierarchical list, where the first level is the item type (e.g., cereal), and the second level is the name of the actual item (e.g., shredded wheat). After adding an item, users must be able to specify a quantity for that item.
  * Implementation is not covered here, however the "Database" class has a method "CheckForItem()" which will make queries to the DB with regards to the user's information.

  * If there is a match, an "Item" object is added to the GroceryList, and the option to "ChangeQuantity()" will appear.

4. Users must also be able to specify an item by typing its name. In this case, the application must look in its DB for items with similar names and ask the users, for each of them, whether that is the item they intended to add. If a match cannot be found, the application must ask the user to select a type for the item and then save the new item, together with its type, in its DB.
  * This is part of the implementation, explained in the step above.

5. Lists must be saved automatically and immediately after they are modified.
  * This is going to use the “SaveList()” method, inside the “GroceryList” class .

6. Users must be able to check off items in a list (without deleting them).
  * The "IsItemChecked" attribute in the "Item" class along with the "checkForItem" each check off an item.

7. Users must also be able to clear all the check-off marks in a list at once.
  * This requirement is handled by the "CheckAllItems()" method in the "GroceryList" class, allows to check off all items at once.

8. Check-off marks for a list are persistent and must also be saved immediately.
  * This requirement is used by the method "SaveList()" in the “GroceryList” class, which will continually autosave with changes

9. The application must present the items in a list grouped by type, so as to allow users to
shop for a specific type of products at once (i.e., without having to go back and forth
between aisles).
  * Not necessary for the diagram, this is specific to the UI.
10. The application must support multiple lists at a time (e.g., “weekly grocery list”, “monthly
farmer’s market list”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete lists.
  * Using the “Customer” class they could, "RenameList()", "DeleteList()", "SelectList()"
"Customer" can have many "GroceryList" ’s, allowing for multiple lists. That’s why these two classes are separate and use a 1 to many relationship.

11. The User Interface (UI) must be intuitive and responsive.
  * Not necessary for the diagram, this is specific to the UI.
