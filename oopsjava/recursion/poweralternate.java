package oopsjava.recursion;
import java.util.Scanner;
public class poweralternate {
    public static int pow(int p , int q)
    {
        if(q%2==0)
        {
            if(q==0)
                return 1;
            return pow(p,q/2)*pow(p,q/2);
        }
        else {
            if(q==0)
                return 1;
            return pow(p,q/2)*pow(p,q/2)*p;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(pow(p,q));
        sc.close();
    }
}
