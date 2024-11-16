package oopsjava.recursion;
import java.util.Scanner;
public class printnto1 {
  public static void fn( int n)
  {
    if(n==1)
    {
      System.out.println(n);
      return;
    }
    System.out.print(n);
    fn(n-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int x = sc.nextInt();
    fn(x);
    sc.close();
  }
}
