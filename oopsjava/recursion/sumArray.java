package oopsjava.recursion;
import java.util.*;
public class sumArray
{
    public static int sum(int[] arr , int idx)
    {
        if(idx == arr.length)
            return arr[idx];
        return arr[idx] + sum(arr , idx+1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("sum of the array is "+sum(arr , 0));
        sc.close();
    }
}
