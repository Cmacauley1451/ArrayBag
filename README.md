How to Use

Instantiate a bag (either LinkedBag<T> or ArrayBag<T>).
Use addNewEntry() to add elements.
Remove elements using remove() (unspecified) or remove(T entry) (specific).
Query bag contents with getFrequencyOf(), contains(), or toArray().
Use the BagTest class as a sample driver to see operations in action.


This project implements two variations of a Bag data structure in Java:

LinkedBag: A linked-list based implementation

ArrayBag: An array-based implementation

The aim of this project is to demonstrate my more advanced java skills, with a key focus on object oriented programming, security and efficient functionality.

What the Project Does

LinkedBag: Uses a singly linked list to store elements. It supports operations such as adding new entries, removing specified or unspecified entries, checking frequency of items, and converting the bag to an array.

ArrayBag: Uses an array to hold elements, managing capacity and resizing. It similarly supports addition, removal, frequency counts, containment checks, and conversion to arrays.

BagTest: A test class that demonstrates and validates the operations of the LinkedBag with example data.


Linked List
The LinkedBag utilizes a custom singly linked list (MyNode<T>) to manage the bag’s contents dynamically without a fixed size limit.

Algorithmic Implementation

Efficient searching within linked lists and arrays.

Handling duplicates and frequency counting.

Removing elements without leaving gaps (linked list pointer adjustments or array swapping).
