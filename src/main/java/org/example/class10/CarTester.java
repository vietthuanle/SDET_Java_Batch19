package org.example.class10;

public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Green";
        car1.make = "Toyota";
        car1.model = "4x4";
        car1.year = 2025;
        car1.price = 102000.58;
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);
        System.out.println(car1.price);
        car1.accelerate();
        car1.applyBreak();
        car1.reverse();

        System.out.println();

        Car kiaCar = new Car();
        kiaCar.color = "Gold";
        kiaCar.make = "Kia";
        kiaCar.model = "Forte";
        kiaCar.year = 2018;
        kiaCar.price = 16000;
        System.out.println(kiaCar.make);
        System.out.println(kiaCar.model);
        System.out.println(kiaCar.color);
        System.out.println(kiaCar.year);
        System.out.println(kiaCar.price);
        kiaCar.accelerate();
        kiaCar.applyBreak();
        kiaCar.reverse();
    }
}
