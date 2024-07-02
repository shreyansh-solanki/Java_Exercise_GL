public interface Addition {
    void add(int num1, int num2);

    default void defaultMethod() {
        System.out.println("This is a Default method of addition !!");
    }
}
