package oopsjava.recursion;

import java.util.Scanner;

public class linearSearch {
    public static void count(int idx)
    {
        System.out.println("The index of the target is "+idx);
    }
    public static boolean findTarget( int[] arr , int idx , int x)
    {
        if(idx == arr.length)
            return false;
        if(x==arr[idx])
        {
            count(idx);
            return true;
        }
        return findTarget(arr , idx+1 , x);

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
        System.out.println("enter the target");
        int x = sc.nextInt();
        if (findTarget(arr, 0, x)) {
            System.out.println("Yes, the target " + x + " is in the array.");
        } else {
            System.out.println("No, the target " + x + " is not in the array.");
        }
        sc.close();
    }
}
