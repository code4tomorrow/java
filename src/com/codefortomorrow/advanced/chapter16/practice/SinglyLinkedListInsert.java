package com.codefortomorrow.advanced.chapter16.practice;
/*
Adding an insert method to a SinglyLinkedList
(details in SinglyLinkedList DIY section). 

Hint: It might be necessary to have a separate case for
inserting at position 0, because that’s when you want to
insert BEFORE the head. For all other positions (1, 2, etc.),
you can simply traverse down the list, keeping track of the
current node, and when you reach the position you want,
add the node AFTER the current node.

Alternatively, you can always add BEFORE the current node
for all position cases (insert before the head to place the
new node at pos 0, insert before node 1 to place the new
node at pos 1, etc.), but then your exception case would
be when the user wants to insert a node at the very end of the list.
In this case, you’d have to write separate code to insert AFTER
the last node.

Make sure you have a toString() method defined!

The following code should output “{2, 3, 4, 7}”:
SinglyLinkedList lst = new SinglyLinkedList();
lst.add(3);
lst.add(7);
lst.insert(4, 1);
lst.insert(2, 0);
System.out.println(lst);
*/
