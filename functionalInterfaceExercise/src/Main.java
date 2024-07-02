public class Main {
    public static void main(String[] args) {
        //Write a custom functional interface and use it with lambda expressions.
        System.out.println("Functional interface and use it with lambda expressions.\n");
        PlayersService playersService = (name, age) ->
                System.out.println("Name: " + name.toUpperCase() + " and Age: " + age);

        Main.addPlayer(playersService);

        //Write a program that takes a list of strings and
        // sorts them based on their length using a Comparator composed with lambda expressions.
        System.out.println("\n\nList of strings and sorts them based on their length using a Comparator composed with lambda expressions\n");
        ListSorting listSorting = new ListSorting();
        listSorting.sortList();

    }

    private static void addPlayer(PlayersService playersService) {
        System.out.println("Player 1");
        playersService.run("Rohit Sharma", 38);

        System.out.println("Player 2");
        playersService.run("Dhoni", 45);

    }
}