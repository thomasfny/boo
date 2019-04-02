# Use Case Model

*This is the template for your use case model. The parts in italics are concise explanations of what should go in the corresponding sections and should not appear in the final document.*

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
| Normal Enent       |1. The user selects a list and renames it <br> 2. The app acknowledges that the list has been renamed <br> 3. The app redirects user back to the main activity |
| Exceptional Event       |1. If the same name has been used while Renaming a List <br> <space> *Inform user that the name is already existed <br> <space> *Return back to Normal Event <br><br>2. Fail to rename a List <br><space> *Inform user that the error occured <br><space> Return back to Normal Event|

|SelectList||
|----------------|-----------|
| Description        |The user select an existing List|
| Pre-conditions        |The list must be created|
| Post-conditions        |Will redirect the user to the List Activity|
| Normal Enent       |1. The user selects a list <br> 2. The app redirects user to the List Activity|
| Exceptional Event       |1. If it can't goes to the alternated List Activity<br>*Inform user that the error occured<br> Return back to the Main Activity|

|DeleteList||
|----------------|-----------|
| Description        |The user delete an existing List|
| Pre-conditions        |The list must be created|
| Post-conditions        |The list will be deleted|
| Normal Enent       |1. The user selects an existing list and deletes it<br> 2. The app ackwledges that the list has been delectd <br> 3. The app redirects the user back to the main Activity|
| Exceptional Event       |1. Fail to create a new List <br><space> *Inform user that the error occured <br><space> Return back to Normal Event|

|AddItem||
|----------------|-----------|
| Description        ||
| Pre-conditions        ||
| Post-conditions        ||
| Normal Enent       ||
| Exceptional Event       ||

|SearchItem||
|----------------|-----------|
| Description        ||
| Pre-conditions        ||
| Post-conditions        ||
| Normal Enent       ||
| Exceptional Event       ||

|DeleteItem||
|----------------|-----------|
| Description        ||
| Pre-conditions        ||
| Post-conditions        ||
| Normal Enent       ||
| Exceptional Event       ||

|ChangeQty||
|----------------|-----------|
| Description        ||
| Pre-conditions        ||
| Post-conditions        ||
| Normal Enent       ||
| Exceptional Event       ||

|Check||
|----------------|-----------|
| Description        ||
| Pre-conditions        ||
| Post-conditions        ||
| Normal Enent       ||
| Exceptional Event       ||

|EverythingCheck||
|----------------|-----------|
| Description        ||
| Pre-conditions        ||
| Post-conditions        ||
| Normal Enent       ||
| Exceptional Event       ||




