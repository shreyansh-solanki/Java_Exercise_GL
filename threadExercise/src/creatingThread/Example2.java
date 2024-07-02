package creatingThread;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Method!!");
    }
}

//Write a program to create a thread by implementing the Runnable interface and passing it to a Thread object.
public class Example2{

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "Thread!! ");

        System.out.println(thread.getName());
        thread.start();
    }

}
