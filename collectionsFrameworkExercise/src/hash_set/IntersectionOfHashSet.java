package hash_set;

import java.util.HashSet;

public class IntersectionOfHashSet {
    private final HashSet<Integer> hset1 = new HashSet<>();
    private final HashSet<Integer> hset2 = new HashSet<>();

    public IntersectionOfHashSet() {
        addValuesToSet1();
        System.out.println("Hash set One");
        printHashSet(hset1);
        addValuesToSet2();
        System.out.println("Hash set Two");
        printHashSet(hset2);
    }

    private void addValuesToSet1() {
        hset1.add(10);
        hset1.add(20);
        hset1.add(30);
        hset1.add(40);
    }

    private void addValuesToSet2() {
        hset2.add(30);
        hset2.add(10);
        hset2.add(50);
        hset2.add(90);
    }

    public void intersectionOfSet() {
        HashSet<Integer> intersectionHashSet = new HashSet<>();
        for (int val : hset1) {
            if (hset2.contains(val)) {
                intersectionHashSet.add(val);
            }
        }
        System.out.println("Intersection of two hash sets");
        printHashSet(intersectionHashSet);
    }

    private void printHashSet(HashSet<Integer> hset) {
        for(Integer val : hset) {
            System.out.println(val);
        }
    }
}
