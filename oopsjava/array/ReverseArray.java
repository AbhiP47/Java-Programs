package oopsjava.array;
import java.util.Scanner;
class ReverseArray{
    public static int[] reverse(int[] arr)
    {
        int ans[] = new int[arr.length];
        int k =0;
        int n = arr.length-1;
        for(int i=0; i<arr.length; i++)
        {
            ans[k++] = arr[n--];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = functions.inputArray();
        functions.printArray(reverse(arr));
    }
}