package ThreadMethod;

public class Demo3 {
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            for(int i=1; i<=100; i++)
            {
                System.out.println("T1 : "+i);
                Thread.yield();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=1; i<=100; i++)
            {
                System.out.println("T2 : "+i);

            }
        });

        t1.start();
        t2.start();
    }
}
/*
Thread.yield() --> It says that I am willing to give my CPU time to someone else with the
same priority that wants to run.

This is just a request  or suggestion and CPU can reject this request. As it is in the hands of the CPU,
who gets the CPU time at what moment?

This method is not generally used in production.
 */