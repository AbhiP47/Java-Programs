package oopsjava.codes;
import java.util.*;
public class maxValueOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int mx = Integer.MIN_VALUE ;
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i] > mx)
                mx = arr[i];
        }
        System.out.println("max element of the array is "+mx);
        sc.close();
    }
}
