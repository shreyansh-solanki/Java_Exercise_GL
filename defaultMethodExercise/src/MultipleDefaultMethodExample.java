//Write a program that demonstrates multiple inheritance of default methods from interfaces.

public class MultipleDefaultMethodExample implements Addition, Multiplication {
    public static void main(String[] args) {

        MultipleDefaultMethodExample multipleDefaultMethodExample = new MultipleDefaultMethodExample();
        multipleDefaultMethodExample.add(10, 10);
        multipleDefaultMethodExample.mul(10, 10);

        multipleDefaultMethodExample.defaultMethod();
    }

    @Override
    public void add(int num1, int num2) {
        System.out.println("Addition: " + num1 + num2);
    }

    @Override
    public void mul(int num1, int num2) {
        System.out.println("Multiplication: " + num1 * num2);
    }

    @Override
    public void defaultMethod() {
        Addition.super.defaultMethod();
        Multiplication.super.defaultMethod();
    }
}
