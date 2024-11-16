package oopsjava.recursion;
import java.util.Scanner;

public class printarray {
    public static void printArr( int[] arr , int idx)
    {
        if(idx == arr.length)
            return;
        System.out.print(arr[idx]+" ");
        printArr(arr , idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++) {
             arr[i] = sc.nextInt();
        }
        printArr(arr, 0);
    }
}
