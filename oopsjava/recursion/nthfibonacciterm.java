package oopsjava.recursion;
import java.util.*;
// to find the nth fibonacci term 
public class nthfibonacciterm {
  public static int fn(int n)
  {
   if(n==0 || n== 1)
   return n;
   return fn(n-1) + fn(n-2);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x  = sc.nextInt();
    System.out.println(fn(x));
    sc.close();
  }
}
