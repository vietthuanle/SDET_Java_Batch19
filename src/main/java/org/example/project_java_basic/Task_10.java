package org.example.project_java_basic;

public class Task_10 {
    public static void main(String[] args) {
        String[] words = {"Hannah", "Andrew", "Alex", "Lila", "Alex", "Johnson", "Hannah"};

        for (int w = 0; w < words.length; w++) {
            for (int n = w+1; n < words.length; n++) {
                if (words[w].equals(words[n])) {
                    System.out.println(words[n]);
                }
            }
        }
    }
}
