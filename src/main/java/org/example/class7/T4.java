package org.example.class7;

public class T4 {
    public static void main(String[] args) {
        String[] animals = {"Eagal", "Wolf", "Dog", "Lion", "Monkey"};
        int x = 0;
        for (String a : animals) {
            System.out.println(a);
        }
        while (x < 5) {
            System.out.println(animals[x]);
            x++;
        }
    }
}
