package oopsjava.stacks;
import java.util.*;
public class printfirstelement {

    public static void main(String[] args) {
        Stack <Integer>st = new Stack<>();
        st.push(4);
        st.push(23);
        st.push(34);
        st.push(5);
        st.push(8);
        while(st.size() > 1)
        {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }

}
