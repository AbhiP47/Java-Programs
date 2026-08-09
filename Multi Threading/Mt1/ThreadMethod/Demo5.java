package ThreadMethod;

public class Demo5 {
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(t1.isAlive());
    }
}
