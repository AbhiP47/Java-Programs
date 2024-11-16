package oopsjava.recursion;

public class maxArray {
    public static int printMax(int[] arr , int idx)
    {
       if(idx == arr.length-1)
           return arr[idx];
       int max ;
       max = printMax(arr , idx+1);
       if(arr[idx] < max )
           return max;
       else
           return arr[idx];
       // OR return Math.max(arr[idx] , printMax(arr , idx+1);

    }
    public static void main(String[] args) {
        int[] arr = {5,6,3,8,4,7};
        System.out.println(printMax(arr, 0)); // idx == 0 tells us that we want to find the
                              // max value in the array from starting that is from index 0 .
    }
}
