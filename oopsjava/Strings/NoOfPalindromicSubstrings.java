package oopsjava.Strings;

// Given a string s, return the number of palindromic substrings in it

import java.util.Scanner;
public class NoOfPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String subst = str.substring(i,j);
                String rev = new StringBuilder(subst).reverse().toString();
                if(subst.equals(rev))
                    count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

