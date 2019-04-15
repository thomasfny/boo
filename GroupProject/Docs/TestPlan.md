# Test Plan



**Author**: \<Team3\>

## 1 Testing Strategy

### 1.1 Overall strategy
  - Write a list of specific test cases
  - Testing test cases
  - Execute test cases
  - Evaluate the results

### 1.2 Test Selection
  - Junit Testing

### 1.3 Adequacy Criterion
  - Verification: the product meet all requirement?
  - Validation: the product produce expected output?

### 1.4 Bug Tracking

  - Using a bug tracking product name JIRA

### 1.5 Technology

  - Junit

## 2 Test Cases
- The default page is an empty grocery list when app is open

|Purpose|Steps|Expected Result|Actual result|Pass/Fail|
|----------------|-----------|-----------|-----------|-----------|
| createList        |press "createlist" button, then enter the name, press ok|A new List is created with the name given by user|N/A|N/A|
|RenameList|press "renamelist" button on selected list, modify the name and press ok|selected list is renamed|N/A|N/A|
|deleteList|press "deletelist" button on selected list, then pop-ip to confirm|selected list is removed|N/A|N/A|

 - When user click a list and go into it, the list is empty which contain no item

|Purpose|Steps|Expected Result|Actual result|Pass/Fail|
|----------------|-----------|-----------|-----------|-----------|
|addItem|look for the item and press add button next to the item|successfully added to the list|N/A|N/A|
|SearchIitem|search the item in the search bar|Found the item in the Database|N/A|N/A|
|deleteItem|select the item and press delete button to delete|successfully deleted from the list|N/A|N/A|
|everythingCheck|Uncheck all the checked items in the list|successfully unchecked all items in the list|N/A|N/A|
|changeQty|change the quantity of items in the list|successfully altered the quantity of items in the list|N/A|N/A|
|check|check items in the list|successfully checked the items what user wanted in the list|N/A|N/A|
