package Practice;

/*

Find the first negative number from  each window of the size k of the array

 */
import java.util.*;
public class SlidingWindow1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the size of the window");
        int k = sc.nextInt();
        int j=0, i=0;
        Deque<Integer> queue = new ArrayDeque<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(j<n)
        {
            if(arr[j]<0)
                queue.addLast(arr[j]);
            if((j-i+1)<k)
            {

                j++;
            }
            else if((j-i+1)==k) {
                if (!queue.isEmpty()) {
                    list.add(queue.peekFirst());
                } else
                    list.add(0);


                if (!queue.isEmpty() && queue.peekFirst() == arr[i]) {
                    queue.pollFirst();
                }
                i++;
                j++;
            }

        }
        for(int val : list)
        {
            System.out.println(val);
        }
    }
}
