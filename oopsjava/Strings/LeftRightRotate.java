package oopsjava.Strings;
import java.util.Scanner;
public class LeftRightRotate
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();
            String[] str = input.split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int K = Integer.parseInt(str[2]);

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int r  = K % N;
            s1 = s1.substring(N-r) + s1.substring(0, N-r);
            int s = K%M;
            s2 = s2.substring(s) + s2.substring(0, s);

            String s3 = s1 + s2;
            StringBuilder sb = new StringBuilder(s3);
            sb.reverse();
            String s4 = sb.toString();

            if (s3.equals(s4))
                System.out.print(s3 + " " + "True");
            else
                System.out.print(s3 + " " + "False");
        }
    }


