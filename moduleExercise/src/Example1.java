import java.util.Optional;

public class Example1 {
    public static void main(String[] args) {
        //Write a program that uses Optional to handle a potentially null value.
        String value = "Optional Example";
        Optional<String> optionalValue = Optional.ofNullable(value);
        String result = optionalValue.orElseThrow(() -> new RuntimeException("Value is not present!"));
        System.out.println(result);

        String nullValue = null;
        optionalValue = Optional.ofNullable(nullValue);
        result = optionalValue.orElseThrow(() -> new RuntimeException("Value is not present!"));
        System.out.println(result);

    }
}