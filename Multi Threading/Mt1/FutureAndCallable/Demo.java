package FutureAndCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = executor.submit(()->10);
        Thread.sleep(4000);

        System.out.println(f1.get());
        executor.shutdownNow();
        executor.shutdown();
    }
}
