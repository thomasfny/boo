# Use Case Model



**Author**: Eli, JianHui, Leonardo, Thomas, William

## 1. Use Case Diagram
![UseCaseDiagram](https://github.com/qc-se-spring2019/370Spring19Team3/blob/master/GroupProject/Docs/UseCaseDiagram.jpg)
## 2. Use Case Descriptions
|CreateList||
|----------------|-----------|
| Description        |The user creates a new List|
| Pre-conditions        |The application has to be opened|
| Post-conditions        |A new List is created with the name given by user|
| Normal Enent       |1. The user types a name and click on "Create" button <br> 2. The app acknowledges the list is created|
| Exceptional Event       |1. If the same name has been used while creating new List <br> <space> *Inform user that the name is already existed <br> <space> *Return back to Normal Event <br><br>2. Fail to create a new List <br><space> *Inform user that the error occured <br><space> Return back to Normal Event <br><br> 3. User exits the app <br><space> *Will do nothing |

|RenameList||
|----------------|-----------|
| Description        |The user rename an existing List|
| Pre-conditions        |The List must be created|
| Post-conditions        |The List will be renamed|
| Normal Event       |1. The user selects a list and renames it <br> 2. The app acknowledges that the list has been renamed <br> 3. The app redirects user back to the main activity |
| Exceptional Event       |1. If the same name has been used while Renaming a List <br> <space> *Inform user that the name is already existed <br> <space> *Return back to Normal Event <br><br>2. Fail to rename a List <br><space> *Inform user that the error occured <br><space> *Return back to Normal Event|

|SelectList||
|----------------|-----------|
| Description        |The user select an existing List|
| Pre-conditions        |The list must be created|
| Post-conditions        |Will redirect the user to the List Activity|
| Normal Event       |1. The user selects a list <br> 2. The app redirects user to the List Activity|
| Exceptional Event       |1. If it can't goes to the alternated List Activity<br>*Inform user that the error occured<br> *Return back to the Main Activity|

|DeleteList||
|----------------|-----------|
| Description        |The user delete an existing List|
| Pre-conditions        |The list must be created|
| Post-conditions        |The list will be deleted|
| Normal Event       |1. The user selects an existing list and deletes it<br> 2. The app ackwledges that the list has been deleted <br> 3. The app redirects the user back to the main Activity|
| Exceptional Event       |1. Fail to delete a List <br><space> *Inform user that the error occured <br><space> *Return back to Normal Event|

|AddItem||
|----------------|-----------|
| Description        |the user add item into a existing list|
| Pre-conditions        |there is at least one list exist|
| Post-conditions        |selected item was add into the list|
| Normal Event       |go to the list and search the item then select it, then click addItem|
| Exceptional Event       |1. fail to add item into the list <br><space>2.inform user that error occur<br><space>3.return back to normal event|

|SearchItem||
|----------------|-----------|
| Description        |search items on list|
| Pre-conditions        |enter items name on search bar|
| Post-conditions        |select items display on screen|
| Normal Event       |go to the list and enter items name on search bar and click searchItem button|
| Exceptional Event       |1.tell user the item you search does not exit<br><space>2.display related item to user <br><space>3. user can create new category and item for it|

|DeleteItem||
|----------------|-----------|
| Description        |remove item into the list|
| Pre-conditions        |there is at least one list exist|
| Post-conditions        |select item was remove from the list|
| Normal Event       |go to the list and select the item, then click deleteItem button|
| Exceptional Event      |1. Fail to delete a List <br><space> 2.Inform user that the error occured <br><space> 3.Return back to Normal Event|

|ChangeQty||
|----------------|-----------|
| Description        |change item quantity in the list|
| Pre-conditions        |there is at least one item exist so we can change the qty of the item|
| Post-conditions        |change the number of quantity bar and confirm, so the qty of item will be change|
| Normal Event       |go to the list enter a amount of enter and click change button|
| Exceptional Event       |quantity does not change and tell the user why quantity does not change <br><space> keep original quantity|

|Check||
|----------------|-----------|
| Description        |check off single item|
| Pre-conditions        |there is at least one item exist in the list|
| Post-conditions        |select item in the list will be mark as check off|
| Normal Event       |go to the list and select the item you want to check off, and click check|
| Exceptional Event       |item still not check and tell the user why item does not check <br><space> keep the item unchecked

|EverythingCheck||
|----------------|-----------|
| Description        |check off all items|
| Pre-conditions        |there is at least one item exist in the list|
| Post-conditions        |all items in the list will be mark as check off|
| Normal Event       |go to the list click everythingCheck button all items will be marked as checked|
| Exceptional Event       |items still not check and tell the user why items does not check <br><space> keep the item unchecked|
