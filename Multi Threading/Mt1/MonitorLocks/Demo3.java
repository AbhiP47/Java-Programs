package MonitorLocks;

public class Demo3 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();

        Thread t1 = new Thread(()-> {
            try {
                test1.m1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(()-> test1.m2());

        t1.start();
        t2.start();
    }
}
class Test1 {
    synchronized void m1() throws InterruptedException {
        System.out.println("m1 entered");
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("m1 exit");
    }

    synchronized void m2()
    {
        System.out.println("m2 entered");
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("m2 exit");
    }
}
