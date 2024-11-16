package oopsjava.array;

// count the number of triplets whose sum is equal to the given target

import java.util.Scanner;
public class countTripletSum {
    public static int CountTriplets(int[] arr , int target){
        int count = 0;
        for(int i =0; i<arr.length ;i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                for(int k=j+1; k<arr.length; k++)
                {
                    if(arr[i]+arr[j]+arr[k] == target)
                        count++ ;
                }
            }
        }
        return count;

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
        System.out.println("enter the target sum");
        int target = sc.nextInt();
        System.out.println(CountTriplets(arr , target));
    }
}
