public class Demo3
{
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Current Thread is : "+ Thread.currentThread().getName());
        });
        t1.start(); // prints the name of t1 thread

        //t1.start(); // We cannot run the same thread more than one time as it gives an illegal third-state exception.

        t1.run(); // prints the name of main thread only
    }
}
