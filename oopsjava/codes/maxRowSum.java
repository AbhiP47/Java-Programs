package oopsjava.codes;

import java.util.*;

/*    Problem: Maximum Row Sum
Difficulty: Easy

You are given a matrix with 𝑁 rows and M columns. Find the sum of the elements in the middle column of the matrix. You can assume that
M is always an odd number.

Input Format:
The first line has two space-separated integers,
N (number of rows) and M (number of columns).
The next N lines contain M space-separated integers representing each row of the matrix.
Output Format:
A single integer that is the sum of all the elements in the middle column of the matrix.

Constraints:
1≤𝑁,
𝑀≤100
1≤N,M≤100
M is always odd, so there will always be a middle column    */


public class maxRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of N & M");
        String input = sc.nextLine();
        String[] str = input.split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int midIndex = M/2;
        int sum = 0 ;
        System.out.println("enter the rows");
        for(int j = 0; j<N ; j++)
        {
            input = sc.nextLine();
            String[] st = input.split(" ");
            sum = sum + Integer.parseInt(st[midIndex]);
        }
        System.out.println(sum);
        sc.close();
    }
}
