package oopsjava.recursion;
import java.util.Scanner;
public class sumofdigits 
{
  public static int sum(int n)
  {
    if(n>0 && n<10)
    {
        return n;
    }
    return sum(n/10)+n%10;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.print(sum(x));
    sc.close();
  }
  
}
