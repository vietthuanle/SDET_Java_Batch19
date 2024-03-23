package org.example.class11;

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {
        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] b = a.split("[?]");
        System.out.println(b.length);
    }
}
