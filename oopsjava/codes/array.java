import java.util.Scanner;
public class array {
    public static void main(String args[])

    {
       int arr[] = new int[10];
        System.out.println("array values");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0 ;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }

    }
}
