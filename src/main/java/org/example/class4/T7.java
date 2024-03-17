package org.example.class4;

public class T7 {
    public static void main(String[] args) {
        double num1 = 1444;
        double num2 = 13462;
        double num3 = 51332;

        if (num1>num2){
            if (num1>num3){
                System.out.println("num1 is the largest");
            }else {
                System.out.println("num3 is the largest");
            }
        } else if (num2>num3) {
            System.out.println("num2 is the largest");
        }else {
            System.out.println("num3 is the largest");
        }
    }
}
