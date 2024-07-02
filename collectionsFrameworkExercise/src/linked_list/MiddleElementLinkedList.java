package linked_list;

import java.util.LinkedList;

public class MiddleElementLinkedList {
    private final LinkedList<Integer> linkedList = new LinkedList<>();

    public MiddleElementLinkedList() {
        addValueToList();
    }

    private void addValueToList() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
    }

    public void middleElementLikedList() {
        System.out.println("Original Linked List: " + linkedList);
        int size = linkedList.size();
        int middleElement = linkedList.get(size/2);

        System.out.println("Middle element: " + middleElement);
    }
}
