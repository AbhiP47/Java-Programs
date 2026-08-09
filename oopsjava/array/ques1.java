package oopsjava.array;

import java.util.*;
public class ques1{
    public static String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char ele : ch)
        {
            if(map.containsKey(ele))
                map.put(ele,map.get(ele)+1);
            else
                map.put(ele,1);
        }
        Queue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(Comparator.comparing(Map.Entry<Character,Integer>::getValue).reversed());
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : pq)
        {
            Character c = entry.getKey();
            Integer val = entry.getValue();
            for(int i=0; i<val; i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        String s = "raaeaedere";
        System.out.print(frequencySort(s));
    }
}