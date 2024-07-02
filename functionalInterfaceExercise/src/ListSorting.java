import java.util.ArrayList;
import java.util.Comparator;

public class ListSorting {
    private final ArrayList<String> arrayList = new ArrayList<>();

    public ListSorting() {
        addValues();
    }

    private void addValues() {
        arrayList.add("program");
        arrayList.add("that");
        arrayList.add("takes");
        arrayList.add("a");
        arrayList.add("list");
        arrayList.add("of");
        arrayList.add("strings");
    }

    public void sortList() {
        System.out.println("Before sorting");
        System.out.println(arrayList);

        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        arrayList.sort(lengthComparator);

        // Print the sorted list
        System.out.println("\nAfter sorting, Sorted list based on length");

        System.out.println(arrayList);
    }
}
