package org.example.class11;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        String str = "Matt is going to regret soon";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 't' || str.charAt(i) == 'T') {
                count++;
            }
        }
        System.out.println(count);
    }
}
