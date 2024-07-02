import java.util.concurrent.CountDownLatch;

public class ThreadCoordinationCountDownLatch {
    private static final int NUM_THREADS = 6;
    private static final CountDownLatch startLatch = new CountDownLatch(1);
    private static final CountDownLatch finishLatch = new CountDownLatch(NUM_THREADS);

    public static void main(String[] args) {
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(new Worker());
            threads[i].start();
        }

        startLatch.countDown();

        try {
            finishLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished their work.");
    }

    static class Worker implements Runnable {
        public void run() {
            try {
                startLatch.await();
                System.out.println("Thread " + Thread.currentThread().getName() + " has finished its work.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                finishLatch.countDown();
            }
        }
    }
}
