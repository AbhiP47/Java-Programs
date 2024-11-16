package oopsjava.recursion;
// print the sum of the series
// 1-2+3-4+5-6.....upto n
import java.util.*;
public class series1 {
    public static int sum(int n)
    {
        if(n%2==0)
        {
            if(n==0)
                return 0;
            return sum(n-1)-n;
        }
        else
        {
            if(n==0)
                return 0;
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
