package JavaLocks;

import java.util.concurrent.locks.StampedLock;

public class StampedLocking {
    public static void main(String[] args) {

        SharedResources sr = new SharedResources();

        Thread r1 = new Thread(()->{
            sr.read();
        });
        Thread r2 = new Thread(()->{
            sr.read();
        });
        Thread r3 = new Thread(()->{
            sr.read();
        });

        Thread w1 = new Thread(()->{
            sr.write(10);
        });
        Thread w2 = new Thread(()->{
            sr.write(20);
        });
        Thread w3 = new Thread(()->{
            sr.write(30);
        });



        w1.start();
        r1.start();
        w2.start();
        r2.start();
        w3.start();
        r3.start();
    }

}

 class SharedResources{
    private  int value = 0;
    StampedLock lock = new StampedLock();


    public int read()
    {
        long stamp = lock.tryOptimisticRead();
        int currentValue = value;
        if(lock.validate(stamp) == false)
        {
            // Fall over logic -> try pessimistic read
            stamp = lock.readLock();
            try{
                currentValue = value;
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+ " -> " +
                        "Reads value : "+currentValue);
                return currentValue;
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            finally {
                lock.unlockRead(stamp);
            }
        }

        return 0;
    }
    public void write(int newValue)
    {
        long stamp = lock.writeLock();
        try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+ " -> Change value from "+value+" to "+newValue);
            this.value = newValue;
        }
        catch (InterruptedException e
        ){}
        finally {
            lock.unlockWrite(stamp);
        }
    }
}
