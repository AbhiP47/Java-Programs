package oopsjava.codes;

import java.util.Scanner;
public class functioncall {
    public static void PrintMyName (String name)
    {
        System.out.println(name);
        return;

    }
    public static void main(String args[]){
        System.out.println("enter the name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        PrintMyName(name);
}
}