import java.util.ArrayList;
import java.util.function.Function;

public class StaticMethod {
    static int square(int num){
        return num * num;
    }

    //Write a program that demonstrates method references with a static method.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(3);

        //method reference to call the static method 'square'
        Function<Integer, Integer> squareMethodReference = StaticMethod::square;

        arrayList.forEach(num -> System.out.println("Square of " + num + ": " + squareMethodReference.apply(num)));
    }
}
