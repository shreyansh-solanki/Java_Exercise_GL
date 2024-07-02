import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        //Write a program to create a CompletableFuture and supply a result using CompletableFuture.completedFuture().
        System.out.println("CompletableFuture.completedFuture()");

        CompletableFuture<Integer> completedFuture = CompletableFuture.completedFuture(20);

        if (completedFuture.isDone()) {
            int result = completedFuture.getNow(-1);
            System.out.println("Result: " + result);
        }

        //Write a program to create a CompletableFuture and supply a result asynchronously using CompletableFuture.supplyAsync().
        System.out.println("CompletableFuture.supplyAsync()");

        CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> "Completable Async!!");

        supplyAsync.thenAccept(result -> System.out.println("Result: " + result));


        //Write a program to combine two CompletableFutures and perform some action when both are complete using thenCombine().
        System.out.println("CompletableFutures using thenCombine()");

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "CompletableFuture");

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> {
            return result1 + " " + result2;
        });

        combinedFuture.thenAccept(combinedResult -> {
            System.out.println("Combined result: " + combinedResult);
        });

        combinedFuture.join();
    }
}