public class Demo2 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().threadId());

        Thread t1 = new Thread(()-> {
            System.out.println("Name of my thread is : "+ Thread.currentThread().getName());
            System.out.println("Id of my thread is : "+ Thread.currentThread().threadId());
        });
        t1.start();

        Thread t2 = new Thread(()-> {
            System.out.println("Name of my 2nd thread is : "+ Thread.currentThread().getName());
            System.out.println("Id of my 2nd thread is : "+ Thread.currentThread().threadId());
        });
        t2.start();

    }
}
