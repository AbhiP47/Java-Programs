package oopsjava.array;

import java.util.Scanner;

public class SecondLargest {
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
        int largest = 0;
        int seclargest =0;
        for(int j=0; j<n; j++)
        {
            if(arr[j]>largest)
            {
                seclargest = largest;
                largest = arr[j];
            }

        }
        System.out.println(seclargest);
        sc.close();
    }
}
