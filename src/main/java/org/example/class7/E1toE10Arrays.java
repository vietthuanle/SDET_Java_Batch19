package org.example.class7;

import java.util.Arrays;

public class E1toE10Arrays {
    public static void main(String[] args) {
        String[] names = new String[50];
        names[4] = "Lala";
        names[10] = "James";
        System.out.println(Arrays.toString(names));

        int[] ages = {10,15,61,62,13,84,56,46};
        System.out.println(ages[2]);

        char [] grades = {'A','B','C','D','F'};
        System.out.println(grades[3]);

        char [] grade = new char[4];
        grade[0]='A';
        grade[1]='B';
        grade[2]='C';
        grade[3]='D';
        System.out.println(Arrays.toString(grade));

        int[] prices={10,20,25,30};
        for(int i=0;i<4;i++){
            System.out.println(prices[i]);
        }

        String[] names2 = {"Ana", "John Cena", "Amee", "Adam", "Jason"};
        for (int i = 0; i < 5; i++) {
            System.out.println(names2[i]);
        }

        String[] names3 = {"Ana", "John Cena", "Amee", "Adam", "Jason"};
        for (String n:names3) {
            System.out.println(n);
        }
    }
}
