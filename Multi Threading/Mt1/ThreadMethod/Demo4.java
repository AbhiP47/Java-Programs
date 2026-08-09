package ThreadMethod;

public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
        while (!Thread.currentThread().isInterrupted())
        {
            System.out.println("Running");
        }
    });
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
 /*
 t1.interrupt()-> This method sends a signal to the T1 thread that it should stop doing what it is doing.

 we can gracefully handle
        --> We can make a thread run until a specific condition is met.
        --> We can cancel a long-running task.
        --> Use to stop the thread pool.

 isInterrupted() --> Return interrupt flag value true or false.
 interrupted() --> Returns interrupt flag value, true or false, but also set it back to false.

 If a thread is in the sleep state, join or waiting state, or timed waiting state and we
  call interrupted on it then we get an interrupted exception.

  */