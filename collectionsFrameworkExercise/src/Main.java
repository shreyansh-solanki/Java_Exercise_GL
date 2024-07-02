import array_list.PrintArrayListOfString;
import array_list.RemoveDuplicates;
import array_list.SortStringArrayList;
import hash_map.HashMapExercise;
import hash_set.CheckElementExistHashSet;
import hash_set.HashSetExercise;
import hash_set.IntersectionOfHashSet;
import linked_list.MiddleElementLinkedList;
import linked_list.PrintLinkedList;
import linked_list.ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        // Write a program to create an ArrayList of Strings and
        // add elements to it. Then, iterate through the ArrayList and print each element.
        PrintArrayListOfString printArrayListOfString = new array_list.PrintArrayListOfString();
        printArrayListOfString.printArrayList();

        //Write a program to remove duplicates from an ArrayList of integers.
        RemoveDuplicates removeDuplicates = new array_list.RemoveDuplicates();
        removeDuplicates.removeDuplicates();

        //Write a program to sort an ArrayList of Strings alphabetically.
        SortStringArrayList sortStringArrayList = new SortStringArrayList();
        sortStringArrayList.sortStringArrayList();

        //Write a program to create a LinkedList of integers and add elements
        // to it. Then, iterate through the LinkedList and print each element.
        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.printLinkedList();

        //Write a program to reverse a LinkedList.
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverseLinkedList();

        //Write a program to find the middle element of a LinkedList.
        MiddleElementLinkedList middleElementLinkedList = new MiddleElementLinkedList();
        middleElementLinkedList.middleElementLikedList();

       //Write a program to create a HashMap where the keys are Strings (representing names)
        // and the values are Integers (representing ages). Add some entries and then iterate
        // through the HashMap, printing each key-value pair.
        HashMapExercise hashMapExercise = new HashMapExercise();
        hashMapExercise.printHashmap();

        //Write a program to remove an entry from a HashMap given the key.
        hashMapExercise.removeEntry();

        //Write a program to check if a specific key exists in a HashMap.
        hashMapExercise.checkSpecificKey();

        //Write a program to create a HashSet of strings and add
        // elements to it. Then, iterate through the HashSet and print each element.
        HashSetExercise hashSetExercise = new HashSetExercise();
        hashSetExercise.printHashSet();

        //Write a program to find the intersection of two HashSet objects.
        IntersectionOfHashSet intersectionOfHashSet = new IntersectionOfHashSet();
        intersectionOfHashSet.intersectionOfSet();

        //Write a program to check if a specific element exists in a HashSet.
        CheckElementExistHashSet checkElementExistHashSet = new CheckElementExistHashSet();
        checkElementExistHashSet.checkIfElementExist(20);
        checkElementExistHashSet.checkIfElementExist(100);
    }
}