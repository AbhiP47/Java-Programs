package oopsjava.array;

import java.util.Scanner;

public class SortZeroOneTwoPointer {
    public static void swap(int[] arr , int a , int b)
    {
        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b]; // a=2 , b=3 ,  a=2+3=5 , b=5-3=2 , a=5-2=3
    }
    public static int[] sort(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==1 && arr[j]==0)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
            else if(arr[i]==0)
                i++;
            else if(arr[j]==1)
                j--;

        }
        return arr;
    }
    public static void printArray(int[] ans)
    {
        for(int element : ans)
        {
            System.out.print(element);
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
