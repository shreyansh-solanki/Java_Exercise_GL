package multipleCatchBlock;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program that takes two integers as input and performs division.
// Handle both ArithmeticException and InputMismatchException.
public class MultipleCatchBlockExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input! Please enter valid integers.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.err.println("Division by zero is not allowed.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return (double) numerator / denominator;
    }


}
