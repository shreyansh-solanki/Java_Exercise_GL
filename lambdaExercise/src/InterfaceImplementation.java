import java.util.ArrayList;
import java.util.Comparator;

public class InterfaceImplementation {
    public static void main(String[] args) {
        //Using lambda expression to create a custom RUNNABLE
        Runnable runnable = () -> {
            System.out.println("Runnable example using lambda expression\n");
        };

        Thread thread = new Thread(runnable);

        thread.start();

        ArrayList<Players> players = new ArrayList<>();
        players.add(new Players("Dhoni"));
        players.add(new Players("Rohit"));
        players.add(new Players("Sachin"));
        players.add(new Players("Virat"));

        // Using lambda expression to create a custom COMPARATOR
        Comparator<Players> customComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

        // Sort the players name using the custom comparator
        players.sort(customComparator);

        System.out.println("Players name after sorting");
        for (Players message : players) {
            System.out.println("Player: " + message.getName());
        }

    }
}