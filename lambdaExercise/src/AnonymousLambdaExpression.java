public class AnonymousLambdaExpression {
    public static void main(String[] args) {
        ArithmeticOperation arithmeticOperationAdd = (val1, val2) -> val1 + val2;

        ArithmeticOperation arithmeticOperationSub = (val1, val2) -> val1 - val2;

        int addRes = arithmeticOperationAdd.calculate(1, 10);
        int subRes = arithmeticOperationSub.calculate(20, 30);

        System.out.println("Anonymous Lambda class");
        System.out.println("Addition Result: " + addRes);
        System.out.println("Subtraction Result: " + subRes);
    }
}
