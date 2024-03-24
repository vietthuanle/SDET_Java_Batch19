package org.example.class12;

public class Printer {
    void printHello() {
        System.out.println("Hello World");
    }

    void printWord(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
