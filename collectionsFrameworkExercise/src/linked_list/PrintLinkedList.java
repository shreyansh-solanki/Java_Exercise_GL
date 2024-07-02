//Write a program to create a LinkedList of integers
// and add elements to it. Then, iterate through the LinkedList and print each element.

package linked_list;

import java.util.LinkedList;

public class PrintLinkedList {

    LinkedList<Integer> linkedList = new LinkedList<>();

    public PrintLinkedList() {
        addValueToList();
    }

    private void addValueToList() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
    }

    public void printLinkedList() {
        System.out.println("Printing linked list of numbers");
        for(int i : linkedList) {
            System.out.println(i);
        }
    }
}
