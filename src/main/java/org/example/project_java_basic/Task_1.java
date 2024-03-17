package org.example.project_java_basic;

public class Task_1 {
    public static void main(String[] args) {
        Double[] temps = {72.5, 14.0, 85.0, 40.1, 120.4, 28.9, 112.8};
        double highest = 0;
        double lowest = 1000;
        for (double t : temps) {
            if (highest < t) {
                highest = t;
            }
            if (lowest > t) {
                lowest = t;
            }
        }
        System.out.println("The highest temperature of the weeks is " + highest + "\u00B0F");
        System.out.println("The lowest temperature of the weeks is " + lowest + "\u00B0F");
    }
}
