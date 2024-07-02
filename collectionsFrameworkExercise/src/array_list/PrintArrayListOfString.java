package array_list;

import java.util.ArrayList;

public class PrintArrayListOfString {
    private final ArrayList<String> arrayList = new ArrayList<>();

    public PrintArrayListOfString() {
        addStringInArrayList();
    }

    private void addStringInArrayList() {
        arrayList.add("Printing");
        arrayList.add("Array List");
        arrayList.add("which contains");
        arrayList.add("string");
    }

    public void printArrayList() {
        for(String str: this.arrayList) {
            System.out.println(str);
        }
    }
//
//    array_list.PrintArrayListOfString printArrayListOfString = new array_list.PrintArrayListOfString();
//        printArrayListOfString.addStringToArrayList("Printing");
//        printArrayListOfString.addStringToArrayList("Array List");
//        printArrayListOfString.addStringToArrayList("which contains");
//        printArrayListOfString.addStringToArrayList("strings");
//
//        printArrayListOfString.printArrayList();


    //    private final ArrayList<String> arrayList;
//
//    public array_list.PrintArrayListOfString() {
//        this.arrayList = new ArrayList<>();
//    }
//
//    public void addStringToArrayList(String str) {
//        this.arrayList.add(str);
//    }
//
//    public void printArrayList() {
//        for(String str: this.arrayList) {
//            System.out.println(str);
//        }
//    }

}
