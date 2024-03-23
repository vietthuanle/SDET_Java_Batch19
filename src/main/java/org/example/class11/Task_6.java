package org.example.class11;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        String str = "   Hello   world   ";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].trim());
        }
    }
}
