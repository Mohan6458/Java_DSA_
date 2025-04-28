package Collection;

import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.add(34);
        st.add(56);
        st.add(67);
        st.pop();
        System.out.println(st.peek());
    }
    
}
