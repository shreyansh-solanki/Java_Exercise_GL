package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates {
    private final ArrayList<Integer> arrayList = new ArrayList<>();

    public RemoveDuplicates() {
        addValuesToList();
    }

    private void addValuesToList() {
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);
    }

    public void removeDuplicates() {
        Collections.sort(arrayList);

        for(int i = 0; i < arrayList.size() - 1; i++) {
            int finalI = i + 1;
            arrayList.removeIf(val -> arrayList.get(finalI).equals(val));

        }
        printList();
    }

    private void printList() {
        System.out.println("List after removing duplicate values");
        for(int i : this.arrayList)
            System.out.println(i);
    }
}
