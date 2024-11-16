package oopsjava.recursion;
import java.util.Scanner;
// to print the fibonacci series
public class fibonacciseries {
  public static int fib(int n)
  {
    if(n==0 || n==1)
    {
      return n;
    }
    return fib(n-1)+fib(n-2);
  }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();
    for(int i = 0 ; i<=x ; i++)
    {
      System.out.println(fib(i));
    }

  }
}
