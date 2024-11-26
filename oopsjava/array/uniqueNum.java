package oopsjava.array;

import java.util.Scanner;

public class uniqueNum {
    public static int uni(int[] arr)
    {
        for(int i=0; i<arr.length ; i++)
        {
            for(int j=i+1; j<arr.length ; j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int k=0; k<arr.length ;k++)
        {
            if(arr[k]!= -1)
                ans = arr[k];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the no. of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values");
        for(int i = 0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique number in the array is:"+ uni(arr));
    }
}
