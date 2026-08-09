package oopsjava.array;

import java.util.Scanner;

public class FirstRepeatValue {
    public static int fRepeat(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                if(arr[i]==arr[j])
                    return arr[i];
            }
        }
        return -1;
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
        System.out.println(fRepeat(arr));
    }
}
