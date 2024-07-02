package creatingThread;

//Write a program to create a simple thread by extending the Thread class and overriding its run() method.
class Example1 extends Thread {
    public void run() {
        System.out.println("Thread Example");
    }

    public static void main(String[] args) {
        Example1 thread = new Example1();
        thread.start();
    }
}