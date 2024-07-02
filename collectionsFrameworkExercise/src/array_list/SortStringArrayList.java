package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringArrayList {
    private final ArrayList<String> arrayList = new ArrayList<>();

    public SortStringArrayList() {
        addValuesToList();
    }

    private void addValuesToList() {
        arrayList.add("hello");
        arrayList.add("this");
        arrayList.add("is");
        arrayList.add("array");
        arrayList.add("list");
        arrayList.add("sorting");
        arrayList.add("example");
    }

    public void sortStringArrayList() {
        System.out.println("Array list before sorting");
        printList();

        Collections.sort(this.arrayList);

        System.out.println("Array list after sorting");
        printList();
    }

    private void printList() {
        for(String str : arrayList)
            System.out.print(str + ", ");
        System.out.println();
    }

}
