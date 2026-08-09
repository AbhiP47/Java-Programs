package oopsjava.array;

// given  an array 'arr' sorted in non-decreasing order, return an array of the squares of each number
// sorted in non-decreasing order using two pointer approach.
/*
   example :
                        arr : |-10|-3|-2|1|4|5|
                        Ans -: arr : |4|16|36|49|100|
 */

import java.util.Scanner;

public class SortSquares {
    public static int power(int p , int q)
    {
        if(q==0)
            return 1;
        return power(p,q-1)*p;
    }
    public static int[] sort(int[] arr)
    {
        int left =0;
        int right = arr.length-1;
        int[] ans = new int[arr.length];
        int k = arr.length-1;
        while(left <= right)
        {
            if(Math.abs(arr[left])>Math.abs(arr[right])) {
                ans[k--] = power(arr[left],2);
                left++;
            }
            else{
                ans[k--] = power(arr[right],2);
                right--;
            }
        }
        return ans;
    }
    public static void printArray(int[] ans)
    {
        for(int element : ans)
        {
            System.out.print(element+" ");
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