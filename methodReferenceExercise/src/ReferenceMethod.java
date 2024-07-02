import java.util.function.BiFunction;

class Addition {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

//Write a program that demonstrates method references with an instance method of an object.
public class ReferenceMethod {
    public static void main(String[] args) {
        Addition addition = new Addition();

        BiFunction<Integer, Integer, Integer> addBiFunction = addition::add;

        System.out.println();
        int ans = addBiFunction.apply(2, 2);
        System.out.println(ans);
    }
}