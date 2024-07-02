package customException;

import java.util.Scanner;

//Define a custom exception class called InvalidAgeException. Write a program that takes the age of a person
// as input and throws InvalidAgeException if the age is less than 0 or greater than 150.
public class CustomExceptionExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is: " + age);
        } catch (InvalidAgeException ex) {
            System.out.println("Invalid Age Exception: " + ex.getMessage());
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age is not valid (must be between 0 and 150).");
        }
    }
}
