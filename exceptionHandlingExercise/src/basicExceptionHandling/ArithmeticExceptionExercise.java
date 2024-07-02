package basicExceptionHandling;

import java.util.Scanner;

//Write a program that divides two numbers entered by the user.
// Handle the ArithmeticException that may occur if the divisor is zero.
public class ArithmeticExceptionExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            double result = (double) numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Error: Division by zero is not allowed.");
        } finally {
            System.out.println("End of program.");
        }
    }
}
