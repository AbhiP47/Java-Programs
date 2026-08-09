package ProblemsInMultiThreading;

public class VisibilityProblem {

   // static  boolean flag = false;
   static volatile boolean flag = false; // volatile --> always read the flag only from the RAM not cache

    public static void main(String[] args) {
        Thread t1= new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            flag = true; // cache --> flag = true;
        });

        Thread t2 = new Thread(()-> {
            while (!flag) { // cache --> flag = false;
               // System.out.println("Thread-2 is running....");  // synchronized
            }
            System.out.println("Thread-2 Finished....................");
        });

        t1.start();
        t2.start();
    }
}
