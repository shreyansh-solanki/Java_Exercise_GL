import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CachedThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

        for (int i = 1; i <= 10; i++) {
            TaskData task = new TaskData("Task "+i);
            System.out.println("A new task has been added: " + task.getName());
            executor.execute(task);
        }

        // Shutdown the executor
        executor.shutdown();
    }
}

class TaskData implements Runnable {
    private final String name;

    public TaskData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        // Simulate reading data from a file
        System.out.println("Doing task: " + name);
    }
}
