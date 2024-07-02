//Write a program that demonstrates the use of default methods in interfaces.
public class DefaultMethodExample implements Addition{
    public static void main(String[] args) {

        DefaultMethodExample defaultMethodExample = new DefaultMethodExample();
        defaultMethodExample.add(10, 10);

        defaultMethodExample.defaultMethod();  // calling default method implemented in Addition interface
    }

    @Override
    public void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}