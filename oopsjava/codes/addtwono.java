import java.util.Scanner;
public class addtwono {
public  static int AddTwoNo( int a , int b)
{
    int sum = a+b;
    System.out.println("the sum is = "+sum);
return sum;
}
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    AddTwoNo( a, b) ;
   sc.close();
}
}