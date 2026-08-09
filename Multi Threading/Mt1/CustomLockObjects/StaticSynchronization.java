package CustomLockObjects;

public class StaticSynchronization{

    public static void main(String[] args) {
        Thread t1 = new Thread(()-> Counter.increment());
        Thread t2 = new Thread(()-> Counter.increment());

        t1.start();
        t2.start();
    }


}

class Counter{
    static int count = 0;

    synchronized static void increment()
    {
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        count++;
        System.out.println(count);
    }
}
