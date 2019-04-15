###Requirmements
	1. A grocery list consists of items the users want to buy at a grocery store. The application must allow users to add items to a list, delete items from a list, and change the quantity of items in the list (e.g., change from one to two pounds of apples).
		>#####  To realize this requirement I considered a class for grocery items called Items, and a class for users called User. One user can have many shopping lists as per Requirmement number 10. And so I now have a Shopping_List Class with a has a relationship with the User class.
				This ShoppingList Class will have operations to add, remove, and to change quantities of items in the shopping-list. 
				Its attributes are grocery items stored as strings. It has a quantity field per item associated with the grocery item. As a [String:Integer] relationship. 
				You may also change the quantity of an existing item in the User classes shopping list
				The User uses an Item to put into the Shopping_List as well.
	2. The application must contain a database (DB) of items and corresponding item types.
		>#####  For this the Shopping_List Class can call upon the database to request an item to be added, or deleted within the local list of the user. To change to quantity is a local matter.
	3. Users must be able to add items to a list by picking them from a hierarchical list, where the first level is the item type (e.g., cereal), and the second level is the name of the actual item (e.g., shredded wheat). After adding an item, users must be able to specify a quantity for that item.
		>#####  A  User uses a Category drop down menu, where Category is represented by a class. Each category is represented by some string. One Category can contain many different grocery items and thus there being a new class GroceryItems. 
				Attributes are groceryCategory inside the Category Class, and groceryItem within the GroceryItems Class. 
				Since the user is using this to add an item to their ShoppingList, the groceryItem class uses the Database class named DB.
	4. Users must also be able to specify an item by typing its name. In this case, the application must look in its DB for items with similar names and ask the users, for each of them, whether that is the item they intended to add. If a match cannot be found, the application must ask the user to select a type for the item and then save the new item, together with its type, in its DB.
		>#####  For this I made a class SearchBar which can have an Attribute input which takes a string to search in the database for an item to add to the ShoppingList, and thus let the parameter of database items accessible to the add Operation within ShoppingList. The Input Attribute In SearchBar allows for the user to also input and write to the database an item that was not found. Operations in this class are saveItemCheck(), which returns a boolean to check and ask the user if they are sure the item they are adding to their searches. searchItem takes a string to initialy serarch the database DB for their item. corretItem is a boolean function asking the user if the item returned is correct, while saveItemCheck is asking if they wish to write in the case the item was never found. addToDB will ask the user to input a value on the case an item was not found in the DB search and will prompt them to add that item with the saveItemCheck Operation.
	5. Lists must be saved automatically and immediately after they are modified.
		>##### 	This does not seem to directly affect the design as a User's ShoppingList is to be a local instance per User, while the database is only changed by a user requesting an item belong inside the database. Where the database (DB) and User Classes never directly come in contact because the User is using selecting items through different Category's and thus uses the GroceryItems Class which has access to the database to only pull information. Or if the item does not exist inside the GroceryItems class, then and only then is it allowed to write to the database a new item.

	6. Users must be able to check off items in a list (without deleting them).
		>#####  A new Operation can be added to ShoppingList called pinImportantItem which lets the user select items on their list they find significat.
	7. Users must also be able to clear all the check-off marks in a list at once.
		>#####  A new Operation clearAllPinnedItems will remove the importance of the items once "highlighted" by the pinImportantItem operation.
	8. Check-off marks for a list are persistent and must also be saved immediately.
		>#####  This should not affect the design of this application. This requirement is implied in its implementation.
	9. The application must present the items in a list grouped by type, so as to allow users to shop for a specific type of products at once (i.e., without having to go back and forth between aisles).
		>#####  The ShoppingList must use the Category class to have access to the groceryCategory field. Since all items in the ShoppingList are groceryItems, they each have a groceryCategory field and now can be sorted by group. 
				This operation will be called sortByCateogry which sorts all items in the grocery list by their alphabetical category name. All Breads, then all Dairy, then all Fish, then all Produce, etc.
	10. The application must support multiple lists at a time (e.g., “weekly grocery list”, “monthly farmer’s market list”). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete lists.
		>#####  This is implied in the UML relationship one to many. As one person can own many grocery lists. But I now add the functionality of the rename operation to a single instance of a ShoppingList Class.
	11. The User Interface (UI) must be intuitive and responsive.
		>#####  This has no bearings on the UML model.
		
		
	>As the final Edit, I decided to Let the User class have functionality of adding, adding by search, deleting, renaming, and changing Quantity. 
	 I let the ShoppingList Class have functionality of pinning important items, clearing them, and sorting by category.
	 I let the GroceryCategory class contain all categories with strings representing different grocery categories.
	 The Grocery Items similarily have just an attribute of specific items.
	 The Shopping List requires access to the Grocery Category in order to sort by category in association with its items.
	 The User sends information to the search bar for terms to search or add. Then it returns a result to store inside their Shopping list and are dependent on eachother.
	 The Database DB can write to itself as an operation, and has attributes of items and itemType.
	 There are Aggreggasional relationships between the User and Shopping Lists, and Grocery Categorys and Grocery Items. Each one has one category which can have many or infinite subcategories.