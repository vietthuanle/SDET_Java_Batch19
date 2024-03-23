package org.example.class11;

public class Task_7 {
    public static void main(String[] args) {
        String str = "This3i4jis comGBJKNbi34nation of 3423nume45(&(*(UberandLe&*HJBtters";
        int count = 0;
        for (int i = 1; i <= str.replaceAll("[^A-Za-z]", "").length(); i++) {
            count = i;
        }
        System.out.println(count);
    }
}
