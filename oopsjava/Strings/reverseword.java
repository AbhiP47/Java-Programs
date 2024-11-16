package oopsjava.Strings;
import java.util.*;
// input - i am an educator
// output - i ma na rotacude
public class reverseword
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        String[] words = s.trim().split(" ");
        for( String word : words)
        {
            result = result.append(new StringBuilder(word).reverse().append(" "));
        }
        System.out.println(result);
        sc.close();
    }
}
