package oopsjava.stacks;
import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(5);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);

        // peek function returns the topmost value of stack
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println("size is : " +st.size());
    }
}
