package org.example.class6;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your country name");
        String country = input.nextLine().toLowerCase();
        switch (country){
            case "vietnam":
                System.out.println("Your country language is Vietnamese");
                break;
            case "usa":
                System.out.println("Your country language is English");
                break;
            case "china":
                System.out.println("Your country language is Chinese");
                break;
            case "korea":
                System.out.println("Your country language is Korean");
                break;
            case "russia":
                System.out.println("Your country language is Russian");
                break;
            case "spain":
            case "mexico":
                System.out.println("Your country language is Spanish");
                break;
            default:
                System.out.println("Country not supported");
        }
    }
}
