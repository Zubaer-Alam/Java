package Lists;

import java.util.LinkedList;
// Linked List is a data structure similar to Array List but varies in internal structure,
// Linked List consists of elements where each element has a reference to the previous and next elements.
// They look like: [0]->[1]->[2]->[3]->[4]....
// Linked Lists become handy if you want to add something to the beginning or the middle of the list.


public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the end of the Linked List
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("Linked List : "+linkedList);

        // Add element to the beginning of the List
        linkedList.addFirst(8);

        // Add element to specified index (1)
        linkedList.add(1,9);

        System.out.println("Modified Linked List : "+linkedList);

        // Printing the size of the linked list
        System.out.println("Size  = "+linkedList.size());

        // Find element by index
        System.out.println("Element at Index 2 : "+linkedList.get(2));

        // Remove an element by value
        linkedList.remove(Integer.valueOf(20));

        // Remove an element by index
        linkedList.remove(3);

        System.out.println("Final Linked List : "+linkedList);
    }
}
