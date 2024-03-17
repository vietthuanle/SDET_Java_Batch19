package org.example.class4;

public class E4toE5NestedIf {
    public static void main(String[] args) {
        boolean main = true;
        boolean room1 = false;
        boolean room2 = true;

        if (main) {
            if (room1) {
                System.out.println("room 1 is opened");
            } else {
                System.out.println("room 1 is closed");
            }

            if (room2){
                System.out.println("Room 2 is opened");
            }else {
                System.out.println("room 2 is closed");
            }

        } else {
            System.out.println("main door is closed");
        }
    }
}
