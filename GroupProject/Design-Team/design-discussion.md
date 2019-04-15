# Team 3 Design Discussion

## Section 1: Individual Designs
Design 1: [EliKleinworm](https://github.com/qc-se-spring2019/370Spring19Team3/tree/master/GroupProject/Design-Individual/EliKleinworm)

![EliKleinworm](https://github.com/qc-se-spring2019/370Spring19Team3/blob/master/GroupProject/Design-Individual/EliKleinworm/design.png)

Pros:  

* have most operations to satisfy the requirements or operations need

Cons:

* lack of relationships between classes


Design 2: [jhuilin](https://github.com/qc-se-spring2019/370Spring19Team3/tree/master/GroupProject/Design-Individual/jhuilin)

![jhuilin](https://github.com/qc-se-spring2019/370Spring19Team3/blob/master/GroupProject/Design-Individual/jhuilin/design.png)

Pros:

* too many unnecessary operations and methods

Cons:

* lack of consideration of database part


Design 3: [thomas.chu](https://github.com/qc-se-spring2019/370Spring19Team3/tree/master/GroupProject/Design-Individual/thomas.chu)

![thomas.chu](https://github.com/qc-se-spring2019/370Spring19Team3/blob/master/GroupProject/Design-Individual/thomas.chu/design.png)

Pros:

* clear and neat, satisfy most requirements, close to our team design

Cons:

* lack of consideration of database part


Design 4: [whaley54d](https://github.com/qc-se-spring2019/370Spring19Team3/tree/master/GroupProject/Design-Individual/whaley54d)

![whaley54d](https://github.com/qc-se-spring2019/370Spring19Team3/blob/master/GroupProject/Design-Individual/whaley54d/design.png)

Pros:

* clear and neat, satisfy most requirements, close to our team design

Cons:

* lack of consideration of database part


Design 5: [LeonardoSuarez](https://github.com/qc-se-spring2019/370Spring19Team3/tree/master/GroupProject/Design-Individual/LeonardoSuarez)

![LeonardoSuarez](https://github.com/qc-se-spring2019/370Spring19Team3/blob/master/GroupProject/Design-Individual/LeonardoSuarez/design.png)


Pros:

* have most operations to satisfy the requirements or operations need

Cons:

* lack of user class


## Section 2: Team Design


Design-Team | Design 1 | Design 2 | Design 3 | Design 4 | Design 5
:-- | :--: | :--: | :--: | :--: | :--:
class User | [x] | [x] | [x] | [x] | [ ]
username | [x] | [x] | [x] | [x] | [ ]
userID | [x] | [ ] | [ ] | [ ] | [ ]
ListOfList<ItemList> | [ ] | [ ] | [ ] | [ ] | [ ]
createList() | [ ] | [ ] | [ ] | [x] | [ ]
deleteList() | [x] | [x] | [x] | [x] | [ ]
renameList() | [x] | [x] | [ ] | [x] | [ ]

Design-Team | Design 1 | Design 2 | Design 3 | Design 4 | Design 5
:-- | :--: | :--: | :--: | :--: | :--:
class List | [x] | [x] | [x] | [x] | [x]
itemName | [x] | [x] | [x] | [x] | [x]
ItemOfList<item> | [x] | [ ] | [ ] | [ ] | [ ]
ListName | [x] | [x] | [ ] | [x] | [x]  
addItem() | [x] | [x] | [x] | [x] | [x]
deleteItem() | [x] | [x] | [x] | [x] | [x]
search() | [x] | [ ] | [ ] | [ ] | [ ]
EverythingCheck() | [x] | [ ] | [ ] | [ ] | [ ]



Design-Team | Design 1 | Design 2 | Design 3 | Design 4 | Design 5
:-- | :--: | :--: | :--: | :--: | :--:
class Item | [x] | [x] | [x] | [x] | [x]
itemName | [x] | [x] | [x] | [x] | [x]
itemID | [ ] | [ ] | [x] | [ ] | [ ]
Quantity | [x] | [ ] | [ ] | [ ] | [ ]
checked | [x] | [ ] | [ ] | [ ] | [ ]
Category | [x] | [x] | [x] | [x] | [x]
changeQty() | [x] | [ ] | [ ] | [ ] | [ ]
check() | [ ] | [ ] | [ ] | [ ] | [ ]

# after discussion we add these 4 classes into our team UML, so we all don't have it
Design-Team | Design 1 | Design 2 | Design 3 | Design 4 | Design 5
:-- | :--: | :--: | :--: | :--: | :--:
class itemList | [ ] | [ ] | [ ] | [ ] | [ ]
arrayList<item> | [ ] | [ ] | [ ] | [ ] | [ ]

Design-Team | Design 1 | Design 2 | Design 3 | Design 4 | Design 5
:-- | :--: | :--: | :--: | :--: | :--:
class categoryList | [ ] | [ ] | [ ] | [ ] | [ ]
arrayList<category> | [ ] | [ ] | [ ] | [ ] | [ ]

Design-Team | Design 1 | Design 2 | Design 3 | Design 4 | Design 5
:-- | :--: | :--: | :--: | :--: | :--:
class storeItem | [ ] | [ ] | [ ] | [ ] | [ ]
item | [ ] | [ ] | [ ] | [ ] | [ ]
itemID | [ ] | [ ] | [ ] | [ ] | [ ]
categoryID | [ ] | [ ] | [ ] | [ ] | [ ]

Design-Team | Design 1 | Design 2 | Design 3 | Design 4 | Design 5
:-- | :--: | :--: | :--: | :--: | :--:
class storeCategory | [ ] | [ ] | [ ] | [ ] | [ ]
category | [ ] | [ ] | [ ] | [ ] | [ ]
categoryID | [ ] | [ ] | [ ] | [ ] | [ ]

## Section 3: Summary
While working on figuring out the right design to use, we got together to discuss the strong and weak points of each UML design to help us all combine the same conclusion on what the final design should look like. 
Each member of the group contributed to help create and conclude the process of the final design. We shared our pros and cons, and we used bits and pieces from each of our Designs which stood out the most to create a better structure. 
