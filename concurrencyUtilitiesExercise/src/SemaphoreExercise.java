import java.util.concurrent.Semaphore;

class SharedResource {
    static int count = 0;
}

class MyThread extends Thread {
    Semaphore semaphore;
    String threadName;

    public MyThread(Semaphore sem, String threadName) {
        super(threadName);
        this.semaphore = sem;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        if (this.getName().equals("Thread1")) {
            System.out.println("Starting " + threadName);
            try {
                System.out.println(threadName + " is waiting for a permit.");
                semaphore.acquire();
                System.out.println(threadName + " gets a permit.");
                for (int i = 0; i < 5; i++) {
                    SharedResource.count++;
                    System.out.println(threadName + ": " + SharedResource.count);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " releases the permit.");
            semaphore.release();
        } else {
            System.out.println("Starting " + threadName);
            try {
                System.out.println(threadName + " is waiting for a permit.");
                semaphore.acquire();
                System.out.println(threadName + " gets a permit.");
                for (int i = 0; i < 5; i++) {
                    SharedResource.count++;
                    System.out.println(threadName + ": " + SharedResource.count);
                    Thread.sleep(1000);
                }
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SemaphoreExercise {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        MyThread threadA = new MyThread(sem, "Thread1");
        MyThread threadB = new MyThread(sem, "Thread2");
        threadA.start();
        threadB.start();
    }
}
