package VirtualThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {
    public static void main(String[] args) {
//        Thread t1 = Thread.startVirtualThread(()->
//        {
//            System.out.println(Thread.currentThread());
//        });

        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        for(int i=1; i<=5; i++)
        {
            executorService.submit(()->{
                System.out.println(Thread.currentThread());
            });
        }

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try{
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
