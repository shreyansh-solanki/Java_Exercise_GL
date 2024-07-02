package hash_map;

import java.util.HashMap;

public class HashMapExercise {
    private final HashMap<String, Integer> hmap = new HashMap<>();

    public HashMapExercise() {
        addValueToMap();
    }

    private void addValueToMap() {
        hmap.put("Dhoni", 43);
        hmap.put("Virat", 32);
        hmap.put("Sachin", 49);
        hmap.put("Rohit", 34);
    }

    public void printHashmap() {
        for (String name : hmap.keySet()) {
            Integer age = hmap.get(name);
            System.out.println("Name: " + name + ", " + "Age: " + age);
        }
    }

    public void removeEntry() {
        String givenKey = "Sachin";
        hmap.remove(givenKey);

        System.out.println("HashMap after removing Sachin");
        printHashmap();
    }

    public void checkSpecificKey() {
        String keyValue = "Dhoni";
        if (hmap.containsKey(keyValue)) {
            Integer age = hmap.get(keyValue);
            System.out.println("Given Key element present in map");
            System.out.println("Name: " + keyValue + ", Age: " + age);
        } else {
            System.out.println("Key element does not exists");
        }
    }
}
