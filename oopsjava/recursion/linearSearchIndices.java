package oopsjava.recursion;

import java.util.Scanner;

public class linearSearchIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target");
        int x = sc.nextInt();
        findIndices(arr,0, n , x);
        sc.close();
    }

    private static void findIndices(int[] arr, int idx, int n , int x) {
        if(idx == n)
            return;
        if(arr[idx] == x)
        {
            System.out.print(idx+" ");
        }
        findIndices(arr , idx+1 , n , x);
    }
}
