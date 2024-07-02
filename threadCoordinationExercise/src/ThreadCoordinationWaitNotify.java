public class ThreadCoordinationWaitNotify {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            try {
                System.out.println("Shared Resource Before Produce: " + sharedResource.getIsProduced());
                sharedResource.produce();
                System.out.println("Shared Resource After Produce: " + sharedResource.getIsProduced());

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                System.out.println("Shared Resource Before Consume: " + sharedResource.getIsProduced());
                sharedResource.consume();
                System.out.println("Shared Resource After Consume: " + sharedResource.getIsProduced());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

class SharedResource {
    private boolean isProduced = false;

    synchronized void produce() throws InterruptedException {
        while (isProduced) {
            wait();
        }
        System.out.println("Producing...");
        Thread.sleep(2000);
        isProduced = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!isProduced) {
            wait();
        }
        System.out.println("Consuming...");
        Thread.sleep(2000);
        isProduced = false;
        notify();
    }

    public boolean getIsProduced() {
        return this.isProduced;
    }
}
