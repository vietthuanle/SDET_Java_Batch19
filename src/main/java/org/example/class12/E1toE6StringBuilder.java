package org.example.class12;

public class E1toE6StringBuilder {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("Sunday165Monday");
        //st.reverse();
        //st.append("Monday");
        //st.deleteCharAt(6);
        st.delete(6, 9);
        //st.insert(15, "0");
        System.out.println(st.indexOf(String.valueOf(st.charAt(9))));

        System.out.println(st);
    }
}
