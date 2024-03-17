package org.example.class7;

public class T3 {
    public static void main(String[] args) {
        String[] car = {"Audi", "BMW", "Toyota", "Honda", "Kia", "Ford"};
        int x = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println(car[i]);
        }
        while (x < 6) {
            System.out.println(car[x]);
            x++;
        }
    }
}
