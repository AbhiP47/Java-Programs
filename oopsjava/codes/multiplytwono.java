import java.util.Scanner;
public class multiplytwono {
  public static int MultiplyTwoNo( int a , int b)
  {
    int product = a*b;
    return product;
  }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = MultiplyTwoNo(x, y);
    System.out.println("product = "+z);
  }
}
