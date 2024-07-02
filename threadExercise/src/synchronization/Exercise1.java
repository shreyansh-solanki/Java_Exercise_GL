package synchronization;

//Write a program to demonstrate synchronization using the synchronized keyword.
class AccountBalance {
    private double balance;

    public AccountBalance(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public double getBalance() {
        return this.balance;
    }

}

public class Exercise1 {
    public static void main(String[] args) {

        AccountBalance account = new AccountBalance(10000);
        System.out.println("Initial Balance: " + account.getBalance());

        Thread thread1 = new Thread(() -> account.deposit(500));
        Thread thread2 = new Thread(() -> account.deposit(800));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
