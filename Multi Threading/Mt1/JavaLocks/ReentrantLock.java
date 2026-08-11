package JavaLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLock {
    public static void main(String[] args) {

        Resource resource = new Resource();

        Thread t1 = new Thread(()->{
            resource.f1();
        });
        Thread t2 = new Thread(()->{
            resource.f1();
        });
        Thread t3 = new Thread(()->{
            resource.f1();
        });
        Thread t4 = new Thread(()->{
            resource.f1();
        });
        Thread t5 = new Thread(()->{
            resource.f1();
        });
        Thread t6 = new Thread(()->{
            resource.f1();
        });
        Thread t7 = new Thread(()->{
            resource.f1();
        });
        Thread t8 = new Thread(()->{
            resource.f1();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }

}

class Resource{

    Lock lock = new java.util.concurrent.locks.ReentrantLock(true);
    void f1()
    {
        lock.lock();
        try
        {
            System.out.println(Thread.currentThread().getName() + " : Entered");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " : Exited");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
