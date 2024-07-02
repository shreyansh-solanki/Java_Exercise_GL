import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {
        Map<String, Integer> players = new HashMap<>();
        players.put("Rohit", 40);
        players.put("Virat", 32);
        players.put("Dhoni", 48);

        String playerName1 = "Bhumra"; // Player not in the map
        String playerName2 = "Rohit"; // Player in the map


        Optional<Integer> player1 = Optional.ofNullable(players.get(playerName1));
        if (player1.isPresent()) {
            System.out.println("Age for " + playerName1 + ": " + player1.get());
        } else {
            System.out.println("No Age found for " + playerName1);
        }

        Optional<Integer> player2 = Optional.ofNullable(players.get(playerName2));
        if (player2.isPresent()) {
            System.out.println("Age of " + playerName2 + ": " + player2.get());
        } else {
            System.out.println("No Age found for " + playerName2);
        }
    }
}
