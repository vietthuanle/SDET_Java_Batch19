package org.example.class4;

public class T6 {
    public static void main(String[] args) {
        int age = 18;
        double weigth = 100;
        if (age>=18){
            System.out.println("You are old enough to donate blood");
            if (weigth>110){
                System.out.println("You pass the weight requirement to donate blood");
            }else {
                System.out.println("You are under the weight requirement to donate blood");
            }
        }else {
            System.out.println("Your are not old enough to be eligibility for donating blood");
        }
    }
}
