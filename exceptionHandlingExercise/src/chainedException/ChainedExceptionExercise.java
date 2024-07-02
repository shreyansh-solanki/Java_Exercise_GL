package chainedException;

import java.util.Scanner;

//Write a program that reads an integer from the user and attempts to convert it to a String. Handle NumberFormatException
// and throw a custom exception ConversionException with the original exception as the cause.
public class ChainedExceptionExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(input);
            String stringValue = String.valueOf(intValue);
            System.out.println("Converted value to String: " + stringValue);
        } catch (NumberFormatException e) {
            ConversionException customException = new ConversionException("Error converting to String", e);
            System.err.println("Custom exception: " + customException.getMessage());
            System.err.println("Original cause: " + customException.getCause().getMessage());
        }

        scanner.close();
    }
}
