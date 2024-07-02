import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Write a program that uses Streams to filter a list of strings based on a condition.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Virat");
        arrayList.add("Dhoni");
        arrayList.add("Sachin");
        arrayList.add("Rohit");

        List<String> filteredWords = arrayList.stream()
                .filter(word -> word.contains("o"))
                .toList();

        System.out.println("Filtered words which contains 'o': " + filteredWords);

        System.out.println();

        //Write a program that uses Streams to map a list of integers to their squares.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();

        System.out.println("Squared numbers: " + squaredNumbers);

        System.out.println();

        //Write a program that uses Streams to find the maximum element in a list of integers.
        List<Integer> numbersList = Arrays.asList(1, 10, 40, 20, 50, 70, 5);
        System.out.println("Numbers list: " + numbersList);
        int maxValue = numbersList
                .stream()
                .mapToInt(val -> val)
                .max().orElseThrow();
        System.out.println("Max integer number from the given list: " + maxValue);
    }
}