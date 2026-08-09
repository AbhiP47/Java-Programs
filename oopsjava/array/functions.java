package oopsjava.array;

import java.util.Scanner;

public class functions {
    public static int[] inputArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements in the array");
        int n = sc.nextInt();
        System.out.println("enter the elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void  printArray(int[] arr)
    {
        for(int ar : arr)
        {
            System.out.print(ar+" ");
        }
    }
    public static void swap(int[] arr ,int i,int j)
    {
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
