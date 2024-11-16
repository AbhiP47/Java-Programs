package oopsjava.codes;

import java.util.Scanner;

public class PercentageMarks{
    public static void main(String[] args)
    {
        System.out.println("enter the marks of five subjects");
        Scanner sc = new Scanner(System.in);
        //reading marks of five subjects
        System.out.println("subject 1");

        int sb1 = sc.nextInt();
        System.out.println("subject 2");
        int sb2=sc.nextInt();
        System.out.println("subject 3");
        int sb3=sc.nextInt();
        System.out.println("subject 4");
        int sb4=sc.nextInt();
        System.out.println("subject 5");
        int sb5=sc.nextInt();
        float sum = sb1+sb2+sb3+sb4+sb5;
        float percent = (sum/500.0f)*100;
        System.out.println("percentage : "+percent+" %");
    }
}