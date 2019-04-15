# design information for grocery manage list

## here is how the UML design structure and requirements

to realize requirement A grocery list consists of items the users want to buy at a grocery store. The application must allow users to add items to a list, delete items from a list, and change the quantity of items in the list (e.g., change from one to two pounds of apples).
I have class customer, and list. and customer can operate to add to or delete from or change of items in the list

to realize requirements The application must contain a database (DB) of items and corresponding item types and Users must be able to add items to a list by picking them from a hierarchical list, where the first level is the item type (e.g., cereal), and the second level is the name of the actual item (e.g., shredded wheat). After adding an item, users must be able to specify a quantity for that item.
 I have class category to classify the items

to realize requirements Lists must be saved automatically and immediately after they are modified. so I have class list with attribute time.

to realize requirements Users must be able to check off items in a list (without deleting them). so I have class customer with operation check off list
 to realize requirements Users must also be able to clear all the check-off marks in a list at once. so I have class customer with operation clear all lists
to realize requirement The application must support multiple lists at a time (e.g., “weekly grocery list”, “monthly farmer’s market list”). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete lists.i have class list with attribute name and I have class customer with operation with add/delete/modify the list
