import java.util.Scanner;
public class getbit {
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int n = sc.nextInt();
    System.out.println("enter the position of the bit to get the bit");
    int pos = sc.nextInt();
    int bit_mask = 1<<pos;
    if((bit_mask & n) == 0)
    {
      System.out.println("the bit is 0");

    }
    else{
      System.out.println("the bit is 1");
    }

    sc.close();
  }
  
}
