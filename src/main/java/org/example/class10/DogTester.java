package org.example.class10;

public class DogTester {
    public static void main(String[] args) {
        Dog dogObj1 = new Dog();
        dogObj1.name = "JoeJoe";
        dogObj1.breed = "German";
        dogObj1.color = "Black";
        dogObj1.age = 4;
        dogObj1.weight = 20;
        System.out.println(dogObj1.name);
        System.out.println(dogObj1.breed);
        System.out.println(dogObj1.color);
        System.out.println(dogObj1.age);
        System.out.println(dogObj1.weight);
        dogObj1.bark();
        dogObj1.eat();

        System.out.println();

        Dog dog2 = new Dog();
        dogObj1.name = "Tut Tut";
        dogObj1.breed = "Husky";
        dogObj1.color = "White and Black";
        dogObj1.age = 7;
        dogObj1.weight = 45.2;
        System.out.println(dogObj1.name);
        System.out.println(dogObj1.breed);
        System.out.println(dogObj1.color);
        System.out.println(dogObj1.age);
        System.out.println(dogObj1.weight);
        dog2.sleep();
    }
}
