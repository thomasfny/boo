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
| Exceptional Event       |1. If the same name has been used while creating new List <br> <space> *Inform user that the name is already existed <br> <space> *Return back to Normal Event <br>2. Fail to create a new List <br><space> *Inform user that the error occured <br><space> Return back to Normal Event <br> 3. User exits the app <br><space> *Will do nothing |

|RenameList||
|----------------|-----------|
| Description        |The user rename an existing List|
| Pre-conditions        |The List must be created|
| Post-conditions        |The List will be renamed|
| Normal Enent       ||
| Exceptional Event       ||

|SelectList||
|----------------|-----------|
| Description        ||
| Pre-conditions        ||
| Post-conditions        ||
| Normal Enent       ||
| Exceptional Event       ||

|DeleteList||
|----------------|-----------|
| Description        ||
| Pre-conditions        ||
| Post-conditions        ||
| Normal Enent       ||
| Exceptional Event       ||

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




*For each use case in the use case diagram, this section should contain a description, with the following elements:*

- *Requirements: High-level description of what the use case must allow the user to do.*
- *Pre-conditions: Conditions that must be true before the use case is run.*
- *Post-conditions Conditions that must be true once the use case is run.*
- *Scenarios: Sequence of events that characterize the use case. This part may include multiple scenarios, for normal, alternate, and exceptional event sequences. These scenarios may be expressed as a list of steps in natural language or as sequence diagrams.*