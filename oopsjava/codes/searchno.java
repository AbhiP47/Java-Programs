import java.util.Scanner;
public class searchno 
{
 @SuppressWarnings("resource")
public static void main(String []args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the size of the array");
 int size = sc.nextInt();
 int arr[] = new int [size];

 

 int i;
 
 System.out.println("enter the values in the array");
 for(i=0;i<arr.length;i++)
 {
   arr[i] = sc.nextInt();
 }
  System.out.println("enter the number to search");
  int x = sc.nextInt();
  for(i=0; i<arr.length; i++)
 {
   if(arr[i]==x)
 {
   System.out.println("no. is found at index "+i);
   break;
 }

 }
 sc.close();
 }
}