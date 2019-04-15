# Project Plan 

**Author**: Eli, JianHui, Leonardo, Thomas, William

## 1 Introduction
The goal is to Develop an Android app called GroceryListManager which will implement a grocery lists. 

## 2 Process Description

These are the following activities in the process.

- Activity_Main
	- Homepage for the user. Here the user has the ability to create a new list or go through existing lists if the user has any.
	* Entrance: No input 
		* On start 
			- Show any existing lists.
			- Show create button.
			- Swipe on the list to delete.
			- Hold a list to rename.   
			- Click on list, goes to the list.
	* Exit: 
		- Autosave.
		- Show created list.

- Activity_List
	- This is the physical list. Here the user views, adds, deletes, change quantity, or checks an item. User has the ability to clear all check off items. Shows all the categories with a drop-down. (this will show all the items listed inside the list.). User can search on click move to Activity-Search.
	* Entrance: Load user items from the list if there is any
		- Add, Delete, change quantity, or checked items.
		- Categories with a drop-down, which shows items.
		- search bar which goes to next activity_search.
		- menu button goes to activity_category 
	* Exit:
		- go to main activity:saving all changes made to the list: add, delete, change quantity
		- or goes to activity_search: new activity
		- or goes to activity_category: new activity

- Activity_search 
	- This allows the user to search for an item to add to his/her list by simpily clicking the search bar. 
	* Entrance: 
		- If we have the searched item, desplay the searched item and add to list. 
		- If item not found display, "No Results found". 
		- User can set the quantity of the searched item.
	* Exit:
		- Autosave.
		- Displays the modified list.  	
- Activity_category
	- This is being used when the user clicks the menu button located on the Activity_List. allows the user to pick the items by category. 
	* Entrance: 
		- Desplay the category of items and add to list.  
	* Exit:
		- Click done button to save to the list.
		- Displays the modified list inside the Activity_List. 

## 3 Team

- Roles for each team member:
	- Eli: Project Manager, Tester, UI Designer, Documentation
	- JianHui: Software Developer, 
	- Leonardo: Software Developer, UI Designer 
	- Thomas: Software Developer, Documentation
	- William: Tester, Software Developer
