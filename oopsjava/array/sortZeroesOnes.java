package oopsjava.array;

import java.util.Scanner;

public class sortZeroesOnes {
    public static int[] sort(int[] arr)
    {
        int zeroescount = 0;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==0)
                zeroescount++;
        }
        for(int i=0; i<zeroescount; i++)
        {
            arr[i] = 0;
        }
        for(int i=zeroescount; i<n; i++ )
        {
            arr[i]=1;
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
