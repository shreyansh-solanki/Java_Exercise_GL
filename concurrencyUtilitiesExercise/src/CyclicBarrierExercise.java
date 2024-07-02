import java.util.concurrent.CyclicBarrier;

class MyThreadClass extends Thread {
    private final CyclicBarrier barrier;

    public MyThreadClass(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is doing some work.");
            for (int i = 0; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + " count: " + i);
            }
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " has completed its work.");

            barrier.await();
            System.out.println(Thread.currentThread().getName() + " continues after the barrier.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class CyclicBarrierExercise {
    public static void main(String[] args) {
        int numberOfThreads = 5;
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads, () -> {
            System.out.println("All threads have reached the barrier. Barrier action executed.");
        });

        for (int i = 0; i < numberOfThreads; i++) {
            new MyThreadClass(barrier).start();
        }
    }
}
