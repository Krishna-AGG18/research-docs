package CollectionFramework;

import java.util.Stack;

public class Stacks {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        System.out.println("Stack : "+ st);

        st.pop();
        System.out.println("Stack : "+ st);

        System.out.println("Peek : "+ st.peek());

        System.out.println("Search 12 : "+st.search(12));
        System.out.println("Search 11 : "+st.search(11));
        System.out.println("Search 10 : "+st.search(10));

        System.out.println("Empty ? : "+ st.empty());
    }
}
