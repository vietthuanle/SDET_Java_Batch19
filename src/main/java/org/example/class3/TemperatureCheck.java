package org.example.class3;

public class TemperatureCheck {
    public static void main(String[] args) {
        double temp = 73.5;
        if (temp<32){
            System.out.println("Water will freeze with temperature "+temp);
        }else {
            System.out.println("Water will NOT freeze with temperature "+temp);
        }
    }
}
