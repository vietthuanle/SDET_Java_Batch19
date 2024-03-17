package org.example.class4;

public class T4 {
    public static void main(String[] args) {
        boolean isDegre = true;
        double gpa = 3.6;

        if (isDegre){
            System.out.println("Congratualtion on your degree");
            if (gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else {
                System.out.println("You should have study harder");
            }
        }else {
            System.out.println("You should get a degree");
        }
    }
}
