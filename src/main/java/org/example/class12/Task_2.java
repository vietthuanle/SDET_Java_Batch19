package org.example.class12;

public class Task_2 {
    public static void main(String[] args) {
        String str = "abda";
        StringBuilder st = new StringBuilder(str);
        if (st.reverse().toString().equals(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
