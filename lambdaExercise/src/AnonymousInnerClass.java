public class AnonymousInnerClass {
    public static void main(String[] args) {
        ArithmeticOperation arithmeticOperationAdd = new ArithmeticOperation() {
            @Override
            public int calculate(int val1, int val2) {
                return val1 + val2;
            }
        };

        ArithmeticOperation arithmeticOperationSub = new ArithmeticOperation() {
            @Override
            public int calculate(int val1, int val2) {
                return val1 - val2;
            }
        };

        int addRes = arithmeticOperationAdd.calculate(1, 1);
        int subRes = arithmeticOperationSub.calculate(1, 10);

        System.out.println("Anonymous Inner class");
        System.out.println("Addition Result: " + addRes);
        System.out.println("Subtraction Result: " + subRes);

    }
}
