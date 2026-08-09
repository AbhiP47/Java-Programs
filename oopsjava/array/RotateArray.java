package oopsjava.array;
import java.util.Scanner;
public class RotateArray {
    public static int[] rotate(int[] arr , int k)
    {
        int n = arr.length;
        k = k%n; // Effective rotation
        int[] array = new int[n];
        int j=0;
        for(int i=n-k ; i<n ; i++)
        {
           array[j++] = arr[i];
        }
        for(int r = 0; r<=n-k-1; r++)
        {
            array[j++] = arr[r];
        }
        return array;
    }
    public static void printArray(int[] ans)
    {
        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements in the array");
        int n = sc.nextInt();
        System.out.println("enter the elements in the array");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        }
        System.out.println("enter the rotation ");
        int k = sc.nextInt();
        int[] ans = rotate(arr, k);
        printArray(ans);
    }
}
