package ThreadMethod;

// Daemon Thread --> Background running Threads
public class Demo8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            while (true) {
                System.out.println("Running....");
            }
        });


        t1.setDaemon(true);
        t1.start();

        try
        {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

/*

There are two types of threads: user threads and daemon threads.
ex : Garbage collector is based on Daemon thread
 */