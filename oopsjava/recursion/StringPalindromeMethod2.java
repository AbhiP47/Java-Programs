package oopsjava.recursion;

import java.util.Scanner;

public class StringPalindromeMethod2 {
    public static boolean palin(String s , int l , int r)
    {
        if(l>=r)
            return true;
        if( (s.charAt(l))==(s.charAt(r)) && palin(s, l+1 , r-1))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        int l = 0;
        int r = s.length() -1;         System.out.println(palin(s , l ,r ));
    }
}
