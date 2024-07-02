package tryCatchFinally;

import java.util.Scanner;

//Write a program to read integers from the user until the user enters "done".
// Calculate the average of the entered numbers and handle any NumberFormatException that may occur
public class TryCatchFinallyExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                e.printStackTrace();
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of entered numbers: " + average);
        } else {
            System.out.println("No valid integers entered.");
        }
    }
}
