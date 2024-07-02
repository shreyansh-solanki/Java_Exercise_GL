package hash_set;

import java.util.HashSet;

public class CheckElementExistHashSet {
    private final HashSet<Integer> hset = new HashSet<>();

    public CheckElementExistHashSet() {
        addValuesToSet();
        printHashset();
    }

    private void addValuesToSet() {
        hset.add(10);
        hset.add(20);
        hset.add(30);
        hset.add(40);
    }

    public void checkIfElementExist(int element) {
        if(hset.contains(element)) {
            System.out.println("Element present in hash set: " + element);
        } else {
            System.out.println("Given element not exist in hash set: " + element);
        }
    }

    private void printHashset() {
        for(Integer val : hset) {
            System.out.println(val);
        }
    }
}
