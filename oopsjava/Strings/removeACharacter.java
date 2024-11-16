package oopsjava.Strings;
import java.util.Scanner;
public class removeACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        String ans ="";
        for(int i = 0 ; i< s.length() ; i++)
        {
         if(s.charAt(i) != 'a')
            ans  = ans + s.charAt(i);
        }
        System.out.println(ans);
    }
}
