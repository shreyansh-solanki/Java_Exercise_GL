package hash_set;

import java.util.HashSet;

public class HashSetExercise {
    private final HashSet<String> hset = new HashSet<>();

    public HashSetExercise() {
        addValuesToSet();
    }

    private void addValuesToSet() {
        hset.add("this");
        hset.add("is");
        hset.add("hash set");
        hset.add("example");
    }

    public void printHashSet() {
        for(String str : hset) {
            System.out.println(str);
        }
    }
}
