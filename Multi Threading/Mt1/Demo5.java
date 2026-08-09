public class Demo5 {

    // Life cycle of thread
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();

        // Thread new stage
        Thread t1 = new Thread(()->{
            System.out.println("Name of current thread is : " + Thread.currentThread().getName());
            System.out.println("Main thread state : " + mainThread.getState());
        });

        System.out.println(t1.getState());

        // Runnable state
        t1.start();;
        System.out.println(t1.getState());


        try
        {
            Thread.sleep(2000);

        }
        catch (Exception e)
        {
            System.out.println(e);

        }

        System.out.println(t1.getState()); // terminated state

    }

}
