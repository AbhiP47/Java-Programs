package oopsjava.codes;
import java.util.Scanner;
// to find HCF or GCD of two numbers using Brute force method
public class hcf
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i;
        int hcf = 1;
        int limit = (x<y)?x:y; // Math.min(x,y);
            for(i=limit ; i>=1 ; i--)
            {
                if(x%i==0 && y%i==0)
                {
                    hcf = i;
                    break;
                }
            }
        System.out.println(hcf);
            sc.close();
    }
}
