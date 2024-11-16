package oopsjava.recursion;
import java.util.Scanner;

public class naturalno {
  public static void fn(int n)
  {
    if(n==1)
    {
      System.out.print(n);
      return;
    }
    fn(n-1);
    System.out.print(n);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int x = sc.nextInt();
    fn(x);
    sc.close();

  }
  
}
