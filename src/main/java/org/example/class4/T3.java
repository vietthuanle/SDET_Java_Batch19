package org.example.class4;

public class T3 {
    public static void main(String[] args) {
        int num = 3524;
        int chck = num % 2;
        if (chck == 0) {
            System.out.println("The number is even");
        } else if (chck == 1) {
            System.out.println("The number is odd");
        } else {
            System.out.println("What did you put in?");
        }
    }
}
