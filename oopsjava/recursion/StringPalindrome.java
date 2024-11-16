package oopsjava.recursion;

import java.util.Scanner;

public class StringPalindrome
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
        String rev = reverse(s , 0);
        if(s.equals(rev))
        {
            System.out.println(s + " is palindrome");
        }
        else
            System.out.println(s + " is not palindrome");
    }
}
