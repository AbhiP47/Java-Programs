package JavaLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    public static void main(String[] args) {

        SharedResource sr = new SharedResource();

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

class SharedResource{
    private  int value = 0;
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    Lock rl = lock.readLock(); // shared lock
    Lock wl = lock.writeLock(); // exclusive lock

    public int read()
    {
        rl.lock();
        try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+ " -> " +
                    "Read value : "+value);
            return value;
        }
        catch (InterruptedException e)
        {

        }
        finally {
            rl.unlock();
        }
        return 0;
    }
    public void write(int newValue)
    {
        wl.lock();
        try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+ " -> Change value from "+value+" to "+newValue);
            this.value = newValue;
        }
        catch (InterruptedException e
        ){}
        finally {
            wl.unlock();
        }
    }
}
