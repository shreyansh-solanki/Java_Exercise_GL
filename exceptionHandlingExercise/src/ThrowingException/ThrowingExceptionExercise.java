package ThrowingException;

//Write a method called validateEmail that accepts an email address as a parameter and
// throws an IllegalArgumentException if the email address is not valid (e.g., doesn't contain "@" symbol).
public class ThrowingExceptionExercise {
    public static void main(String[] args) {
        String email1 = "test@mail.com";
        String email2 = "testmail.com";
        try {
            validateEmail(email1);
            validateEmail(email2);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid email address: " + e.getMessage());
        }
    }

    public static void validateEmail(String emailAddress) {
        if (!emailAddress.contains("@")) {
            throw new IllegalArgumentException("Email address must contain the '@' symbol: " + emailAddress);
        } else {
            System.out.println("Valid email: " + emailAddress);
        }
    }
}
