package oopsjava.array;

import java.util.Scanner;

public class ReverseAnArrayInPlace {

        public static int[] reverse(int[] arr)
        {
            int n = arr.length;
            int i=0;
            while(i<n)
            {
                int temp = arr[n-1];
                arr[n-1] = arr[i];
                arr[i] = temp;
                i++;
                n--;

            }
            return arr;
        }
        public static void  printArray(int[] arr)
        {
            for(int ar : arr)
            {
                System.out.println(ar);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of elements in the array");
            int n = sc.nextInt();
            System.out.println("enter the elements in the array");
            int[] arr = new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            reverse(arr);
            printArray(arr);
        }
    }

