import java.util.Scanner;
public class factorialloop {
  public static void main(String []args)
  {
    System.out.println("enter the number to find its factorial");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i , fact=1;
    for(i=n;i>=1;i--)
    {
      fact = fact * i;
    }
    System.out.println("factorial of the given no. "+n+" is "+fact);

  }
  
}
