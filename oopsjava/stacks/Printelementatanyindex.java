package oopsjava.stacks;

import java.util.Stack;
import java.util.Scanner;

public class Printelementatanyindex {
    public static void indexElement(Stack<Integer>st , int i)
    {
        while(st.size()>i+1)
        {
            st.pop();
        }
        System.out.println(st.peek());
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        System.out.println(st);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index to find the corresponding element");
        int i = sc.nextInt();
        indexElement(st,i);
        sc.close();




    }
}
