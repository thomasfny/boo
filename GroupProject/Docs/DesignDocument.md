# Design Document

**Author**: Team3

## 1 Design Considerations

*The subsections below describe the issues that need to be addressed or resolved prior to or while completing the design, as well as issues that may influence the design process.*

- No list can have the same name when we create new lists
- Double confirm that if user want to delete a list
- The deleteList button should be unclickable if there is no lists there.
- The renameList button and delete button will be clickable if and only if a list has been selected
- The everythingCheck can be clickable if and only if there is at least one item in the list
- The changeQty method is set to zero, means that remove the item

### 1.1 Assumptions
 - User knows how to download, install apk and the mobile device has  minimal hardware requirements
 - The app is not available for download at this time and is going to be implemented at a later date.

### 1.2 Constraints
  - Each grocery lists is stored locally and can't share between mobile devices.

### 1.3 System Environment

  - The Application runs on Android 4.4 and is minimal OS requirement. 
  - Only Android devices can download it.

## 2 Architectural Design

  - High level design view of a systems
  - Basis for detailed design work

### 2.1 Component Diagram

  - No back end system is needed since the application is a simple static app and will store the required data in the local database. 

### 2.2 Deployment Diagram

- Since this is a simple app and will run only on Android devices. Moreover it will only use local database and won't share among different Android devices.

## 3 Low-Level Design

- N/A

### 3.1 Class Diagram
*In the case of an OO design, the internal structure of a software component would typically be expressed as a UML class diagram that represents the static class structure for the component and their relationships.*

![ClassDiagram](https://github.com/qc-se-spring2019/370Spring19Team3/blob/master/GroupProject/Design-Team/Team%20Design.jpg)

### 3.2 Other Diagrams

*<u>Optionally</u>, you can decide to describe some dynamic aspects of your system using one or more behavioral diagrams, such as sequence and state diagrams.*

## 4 User Interface Design
- When the user launches the app on the android device, the user is taken directly to the ListManager.
- On the top left side of the app, there exist the hamburger menu. It will always present there in every menu. Under the menu there will be ListManager, Category and Search options.
- Whenever the user wanted to add an item, the hamburger menu is needed to be chosen. The user then choose Category from the menubar. The app will then redirect to the category menu which will show the Grocery items which are categorized by their types.  
- Whenever the user wanted to add an item by searching from the database, the hamburger menu is needed to be chosen. The user then choose Search from the menubar. The app will then redirect to the Search menu which will then let the user to type in the item name. Based on the string that user typed in, the app will then search the item from the database.  
- Whenever the user wanted to see the List, the hamburger menu is needed to be chosen. The user then choose ListManager from the menubar. The app will then redirect to the List menu which has the list of items added by the user.  


 ![UserInterfaceDiagram](https://github.com/qc-se-spring2019/370Spring19Team3/blob/master/GroupProject/Docs/UserInterfaceDiagram.jpg)