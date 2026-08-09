package oopsjava.array;

// given an array . Move all the even integers in the begining followed by the odd integers.

import java.util.Scanner;

public class SortOddEven {
    public static void swap(int[] arr ,int i,int j)
    {
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    public static int[] sort(int[] arr)
    {
        int i=0;
        int j = arr.length-1;
        while(i<j)
        {
            if(arr[i]%2!=0 && arr[j]%2==0)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
            else if(arr[i]%2==0)
                i++;
            else if(arr[j]%2!=0)
                j--;
        }
        return arr;
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
        int[] ans = sort(arr);
        printArray(ans);
    }
}
