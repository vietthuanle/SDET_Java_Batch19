package org.example.class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.make = "Apple";
        iphone.model = "Iphone 15";
        iphone.os = "Ios 17.6";
        iphone.storageSize = 128;
        System.out.println(iphone.make);
        System.out.println(iphone.model);
        System.out.println(iphone.os);
        System.out.println(iphone.storageSize);

        System.out.println();

        Phone pixel = new Phone();
        pixel.make = "Google";
        pixel.model = "Pixel 8 Pro";
        pixel.os = "Android 13";
        pixel.storageSize = 64;
        System.out.println(pixel.make);
        System.out.println(pixel.model);
        System.out.println(pixel.os);
        System.out.println(pixel.storageSize);

        System.out.println();

        Phone galaxy = new Phone();
        galaxy.make = "SamSung";
        galaxy.model = "Galaxy Note 6";
        galaxy.os = "Android 17";
        galaxy.storageSize = 256;
        System.out.println(galaxy.make);
        System.out.println(galaxy.model);
        System.out.println(galaxy.os);
        System.out.println(galaxy.storageSize);

        System.out.println();

        iphone.sendEmail();
        pixel.alarmGoOff();
        galaxy.receivingCall();
    }
}
