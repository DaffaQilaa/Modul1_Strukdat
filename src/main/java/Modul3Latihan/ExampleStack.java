package Modul3Latihan;

import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push("aku");
        st.push("anak");
        st.push("Indonesia");

        System.out.println("next : "+st.peek());
        st.push("raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("aku");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
