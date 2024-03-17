package org.example.class5;

import java.util.Scanner;

public class T11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score for the quiz");
        double quizScore = input.nextDouble();
        System.out.println("Please enter your score for the mid term");
        double midtermScore = input.nextDouble();
        System.out.println("Please enter your score for the final");
        double finalScore = input.nextDouble();
        double average = (quizScore + midtermScore + finalScore) / 3;
        char grade = ' ';

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average < 50) {
            grade = 'F';
        }
        System.out.println("Your average score is " + average + " and your grade is " + grade);
    }
}
