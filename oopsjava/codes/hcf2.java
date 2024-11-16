package oopsjava.codes;
// to find GCD or HCF of two numbers using long division method
import java.util.Scanner;
public class hcf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        while(x%y!=0)
        {
            int rem = x%y;
            x = y;
            y = rem;
        }
        System.out.println(y);
        sc.close();
    }
}
