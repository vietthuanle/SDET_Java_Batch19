package org.example.class12;

public class Task_1 {
    public static void main(String[] args) {
        String str = "This is sentence i want to reverse";
        String[] reverse = str.split(" ");
        StringBuilder st;
        for (String s : reverse) {
            st = new StringBuilder(s);
            System.out.print(st.reverse() + " ");
        }
    }
}
