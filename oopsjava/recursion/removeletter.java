package oopsjava.recursion;
import java.util.*;

public class removeletter {
    public static String remove(String s , char ch , int idx , String ans)
    {
        if(idx == s.length())
            return ans ;
        if(s.charAt(idx) != ch)
        {
            ans = ans + s.charAt(idx);
        }
         return remove(s , ch , idx+1 , ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        System.out.println("enter the letter to be removed");
        char ch = sc.next().charAt(0);
        String ans = "";
        System.out.println(remove(s , ch , 0 , ans));
    }
}
