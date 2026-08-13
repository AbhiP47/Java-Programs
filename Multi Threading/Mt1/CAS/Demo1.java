package CAS;

import java.util.concurrent.atomic.AtomicReference;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        LikeCounter likeCounter = new LikeCounter();

        Thread t1 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }
        });
        Thread t3 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }        });
        Thread t4 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }        });
        Thread t5 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }        });
        Thread t6 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }        });
        Thread t7 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }        });
        Thread t8 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }        });
        Thread t9 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }        });
        Thread t10 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }        });
        Thread t11 = new Thread(()->{
            for(int i=1; i<50; i++)
            {
                likeCounter.like();
            }        });

        t1.start();
        t1.join();

        t3.start();
        t3.join();

        t4.start();
        t4.join();

        t5.start();
        t5.join();

        t6.start();
        t6.join();

        t7.start();
        t7.join();

        t8.start();
        t8.join();

        t9.start();
        t9.join();

        t10.start();
        t10.join();

        t11.start();
        t11.join();

        System.out.println("total likes " + likeCounter.getTotalLikes());
    }
}

class LikeCounter{

    AtomicReference<Integer> totalCount = new AtomicReference<>(0);

    public void like()
    {
        Integer currentCount;
        Integer finalCount;
        while(true)
        {
             currentCount = totalCount.get();

             finalCount = currentCount + 1;

            if(totalCount.compareAndSet(currentCount,finalCount))
                return;

            System.out.println("Conflict detected : retrying....");
        }

    }

    public int getTotalLikes()
    {
        return totalCount.get();
    }
}