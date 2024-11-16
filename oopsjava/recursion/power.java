package oopsjava.recursion;
import java.util.Scanner;
// to find the power of a number using recursion
public class power {
    public static int pow(int p , int q)
    {
        if(q==0)
            return 1;
        return pow(p,q-1)*p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(pow(p,q));
        sc.close();

    }
}
