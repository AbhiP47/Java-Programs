package oopsjava.array;

import java.util.Scanner;

public class RotateArrayWithoutExtraSpace {
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] Rotatearray(int[] arr , int k )
    {
        int n = arr.length;
        k = k % n; // Handle cases where k >= n

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
        return arr;
    }
    public static void printArray(int[] ans)
    {
        for (int an : ans) {
            System.out.print(an);
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
        int[] ans = Rotatearray(arr, k);
        printArray(ans);
    }
}
