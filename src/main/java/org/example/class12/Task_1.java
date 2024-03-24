package org.example.class12;

public class Task_1 {
    public static void main(String[] args) {
        String word = "aba";
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String reverseWord = sb.toString();
        if (word.equals(reverseWord)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        StringBuilder st =new StringBuilder("aba");
        StringBuilder st2 = new StringBuilder("ab2a");
        System.out.println(st.toString().equals(st2.toString()));
    }
}
