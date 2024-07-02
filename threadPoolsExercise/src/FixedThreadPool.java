import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FixedThreadPool {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

            for (int i = 0; i < 20; i++) {
                Task task = new Task("Task " + i);
                System.out.println("A new task has been added: " + task.getName());
                executor.execute(task);
            }

            System.out.println("Maximum threads inside pool: " + executor.getMaximumPoolSize());

            // Shutdown the executor
            executor.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            // Simulate some work
            long duration = (long) (Math.random() * 10);
            System.out.println("Doing a task: " + name);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
