package ThreadMethod;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main Thread starts");

        try
        {
            Thread.sleep(2000);

        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Main THread Ends");
    }
}
