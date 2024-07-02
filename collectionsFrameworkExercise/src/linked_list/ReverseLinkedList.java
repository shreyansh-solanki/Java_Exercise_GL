package linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

    private final LinkedList<Integer> linkedList = new LinkedList<>();

    public ReverseLinkedList() {
        addValueToList();
    }

    private void addValueToList() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
    }

    public void reverseLinkedList() {
        System.out.println("Original Linked List: " + linkedList);

        Collections.reverse(linkedList);

        System.out.println("Reversed Linked List: " + linkedList);
    }
}
