package synchronization;

class Sender {
    public synchronized void send(String msg) {
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println(msg + " Sent");
    }
}

class ThreadedSend extends Thread {
    private final String msg;
    private final Sender sender;

    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Sender send = new Sender();

        // Create two threads sharing the same Sender object.
        ThreadedSend thread1 = new ThreadedSend("Hello", send);
        ThreadedSend thread2 = new ThreadedSend("World", send);

        // Start the threads.
        thread1.start();
        thread2.start();
    }
}
