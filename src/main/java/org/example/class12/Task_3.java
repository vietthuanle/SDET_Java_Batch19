package org.example.class12;

public class Task_3 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello my");
        StringBuilder str2 = new StringBuilder("Wonder world");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        for (int i = 0; i < str1.length(); i++) {
            str2.append(str1.charAt(i));
        }
        for (int i = 0; i < str2.indexOf(String.valueOf(str1.charAt(0))); i++) {
            str1.append(str2.charAt(i));
        }
        str1.delete(0, str1.indexOf(String.valueOf(str2.charAt(0))));
        str2.delete(0, str1.length());

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}
