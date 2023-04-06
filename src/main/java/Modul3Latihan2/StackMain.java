package Modul3Latihan2;

public class StackMain {
    public static void main(String[] args) {
        MyStack st = new MyStack(4);

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
