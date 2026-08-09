package ThreadMethod;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {

        // Join Method
        System.out.println("Main thread starts");

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " :  starts");

        });
        t1.start();

//        t1.join(); // Let the T1 thread finish its execution
        t1.join(3000); // wait until 3 seconds for the t1 to execute then continue

        System.out.println("Main thread Ends");
    }
    }
