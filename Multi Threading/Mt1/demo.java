public class demo{
  public static void main(String[] args) {
    
    MyThread t1 = new MyThread();

    t1.start();

    MyRunnable r1 = new MyRunnable();
    Thread t2 = new Thread(r1);

    Thread t3 = new Thread(()-> System.out.println("t3 is running"));
    t2.start();

  }
}

// Thread Class Extend
 class MyThread extends Thread{
  @Override
  public void run()
  {
    System.out.println("Thread is running");
  }
 }

 // Thread using Runnable interface
// Better Approach
class MyRunnable implements Runnable{

  @Override
  public void run()
  {
    System.out.println("Runnable thread is running");
  }

 }