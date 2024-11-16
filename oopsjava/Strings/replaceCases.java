package oopsjava.Strings;
import java.util.*;
public class replaceCases {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0 ; i<str.length() ; i++)
        {
            boolean flag = true; // for capital letter
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 97)
               flag = false ; // small letter
            if(flag == true)
                ascii += 32; // converting character to lower case
            else
                ascii -= 32; // converting character to upper case
            str.setCharAt(i,(char)ascii);
        }
        System.out.println(str);
        sc.close();
    }

}
