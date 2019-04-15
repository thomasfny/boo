# User Manual

**Author**: Team 3

##  Table of Contents
1.0. General Information  
1.1. System Overview  
2.0. System Information  
2.1. System Configuration  
3.0. Getting Started  
3.1. Installation  
3.2. List Menu 
3.2.1. Create Grocery List Menu  
3.2.2. Delete Grocery List Menu 
3.2.3. Selected Grocery List Menu 
3.2.4. Rename Grocery List Menu
3.3. Item Menu  
3.3.1. Add Item 
3.3.2. Selected Item Menu  
3.3.3. Delete All Items Menu 
3.3.4. Change Item Quantity Menu  
3.3.5. Check off Item Menu 
3.3.6. Check off All Item Menu 
4.0. Technical support  


## 1.0 General Information
GroceryListManager is an application to manage grocery lists.

## 1.1 System Overview
In the Grocery List Manager App, a user has the ablility to create an individual grocery list, and populate each grocery list with items from an Items database. These grocery lists can be deleted.  
Items can be checked and deleted and new Items can be created under existing Item Types.  
These Items can be deleted too.

## 2.0 System Information
This provides a general overview of the system in terms of hardware and software components.

## 2.1 System Configurations
Grocery List Manager is an application for mobile devices, specifically android. The minimum target for Android app is API level 21. Android 4.4 

## 3.0 Getting Started
This section explains how to use Grocery List on the device and the various activities that can be done with this app.

## 3.1 Installation
This App can be installed directly on a device.

## 3.2 List Menu
The list menu consist of four settings: "Add", "Delete", and "Rename"

### 3.2.1 Create Grocery List Menu
- This is used for create a new Grocery List.
- The application has to be opened.
- A new List is created with the name given by user.
- 1. The user types a name and click on "Create" button <br> 2. The app acknowledges the list is created.
- 1. If the same name has been used while creating new List <br> <space> *Inform user that the name is already existed. <br> <space> *Return back to Normal Event <br><br>2. Fail to create a new List <br><space> *Inform user that the error occured <br><space> Return back to Normal Event <br><br> 3. User exits the app <br><space> *Will do nothing. 


### 3.2.2 Delete Grocery List Menu
- This is used for delete Grocery Lists which already created.
- 1. The user selects an existing list and deletes it<br> 2. The app ackwledges that the list has been deleted <br> 3. The app redirects the user back to the main Activity
- 1. Fail to delete a List <br><space> *Inform user that the error occured <br><space> *Return back to Normal Event


### 3.2.3 Selected Grocery List Menu
- This is used for modifying the list which already created.
- The user select an existing List
- The list must be created
- 1. The user selects a list <br> 2. The app redirects user to the List Activity
- 1. If it can't goes to the alternated List Activity<br>*Inform user that the error occured <br> *Return back to the Main Activity


### 3.2.4 Rename Grocery List Menu
- This is used for rename an existing Grocery List.
- The List must be created, The List will be renamed
- 1. The user selects a list and renames it <br> 2. The app acknowledges that the list has been renamed <br> 3. The app redirects user back to the main activity 
- Clicking on this list menu opens an editable text input box where the new name of the grocery list is typed.
- 1. If the same name has been used while Renaming a List <br> <space> *Inform user that the name is already existed <br> <space> *Return back to Normal Event <br><br>2. Fail to rename a List <br><space> *Inform user that the error occured <br><space> *Return back to Normal Event.


## 3.3 Item Menu
Clicking on a particular list takes you to that list page. You can "Add Item", "Delete Item", "Delete All Items", "Check Off Items" , "Change Item Quenatity


### 3.3.1 Add Item 
- This is used for add item to selected Grocery List.
- At least one list exist
- Selected item was add into the list
- Go to the list and search the item then select it, then click addItem
- 1. Failed to add item into the list <br><space> 2. Inform user that error occur<br><space>3.return back to normal event

### 3.3.2 Selected Item Menu
- Enter items name on search bar
- Select items display on screen
- Go to the list and enter items name on search bar and click searchItem button
- 1. Tell user the item you search does not exit<br><space>2. Display related item to user <br><space>3. User can create new category and item for it

### 3.3.3 Delete All Items Menu
- This is used for delete all items already added to list.
- There is at least one list exist
- Select item was remove from the list
- Go to the list and select the item, then click deleteItem button
- 1. Fail to delete a List <br><space> 2. Inform user that the error occured <br><space> 3. Return back to Normal Event.
- An empty item list page is on the landing page.

### 3.3.4 Change Item Quantity Menu
- This is used for edit the quantity of existing items on the list.
- There is at least one item exist so we can change the quantity of the item
- Change the number of quantity bar and confirm, so the quantity of item will be change
- Go to the list enter a amount of enter and click change button
- Quantity does not change and tell the user why quantity does not change <br><space> keep original quantity.

### 3.3.5 Check off Item Menu
- This is used for check off item(s) on the list.
- there is at least one item exist in the list
- select item in the list will be mark as check off
- Go to the list and select the item you want to check off, and click check|
- Item still not check and tell the user why item does not check <br><space> Keep the item unchecked

### 3.3.6 Check off All Item Menu
- Check off all items.
- There is at least one item exist in the list.
- All items in the list will be mark as check off.
- Go to the list click everythingCheck button all items will be marked as checked.
- Items still not check and tell the user why items does not check <br><space> keep the item unchecked.


## 4.0 Technical Support
If you have any issues with using this app, please contact us.
