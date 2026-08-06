package oopsjava.hashmaps;

/*

Given an array find the most frequent element in it.
If there are multiple elements that appear a maximum
no. of times then print any one of them.

*/

import java.util.*;

public class ques1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        int count = 1;
        for(int i=0; i<n; i++)
        {
            map.putIfAbsent(arr[i],1);
            if(map.containsKey(arr[i]))
                map.put(arr[i],++count);
        }
        int max = 0;
        for(var entry : map.entrySet())
        {
            if(entry.getKey()>max)
                max = entry.getKey();
        }
        for(var entry : map.entrySet())
        {
            if(entry.getValue().equals(max))
                System.out.println(entry.getValue());
        }
    }
}
