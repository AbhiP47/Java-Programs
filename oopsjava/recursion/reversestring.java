package oopsjava.recursion;

import java.util.Scanner;

public class reversestring
{
    public static String reverse(String s , int idx )
    {
        if(idx == s.length())
            return "";
         return  reverse(s , idx+1) + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        System.out.println(reverse(s , 0));
    }
}
