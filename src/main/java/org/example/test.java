package org.example;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*
        Test Data

        [] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j=0;j<a[i].length;j++){
                a[i][j]= in.nextInt();
            }
        }
        int largest=a[0][0];
        for(int i =0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){

            }
        }
         */

        Scanner input = new Scanner(System.in);
        String indvidualName = "";
        String[] names = new String[4];
        String[] times = new String[4];
        int dayNum = 0;
        String day = "";
        int monthNum = 0;
        String month = "";
        int dateNum = 0;
        String date = "";

        System.out.println("Enter name");
        for (int i = 0; i < names.length; i++) {
            if (!input.nextLine().isEmpty()){
                names[i] = input.nextLine();
            } else {
                break;
            }
        }

        System.out.println("Enter time");
        for (int i = 0; i < times.length; i++) {
            indvidualName = input.nextLine();
            if (indvidualName.isEmpty()){
                break;
            } else {
                times[i] = input.nextLine();
            }
        }

        System.out.println("Enter day number from 2-6");
        dayNum = input.nextInt();
        switch (dayNum) {
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            default:
                System.out.println("Wong number");
                System.exit(0);
        }

        System.out.println("Enter month number from 1-12");
        monthNum = input.nextInt();
        switch (monthNum) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("Wong number");
                System.exit(0);
        }

        System.out.println("Enter date number");
        dateNum = input.nextInt();
        if (dateNum == 1 || dateNum == 21 || dateNum == 31) {
            date = dateNum + "st";
        } else if (dateNum == 2 || dateNum == 22) {
            date = dateNum + "nd";
        } else if (dateNum == 3 || dateNum == 23) {
            date = dateNum + "rd";
        } else {
            date = dateNum + "th";
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase("null")){
                System.out.println("Program ended");
                System.exit(0);
            }
            System.out.println("Good morning, " + names[i] + "!");
            System.out.println("This is Dr. Kristina Nguyen's dental office.");
            System.out.println(
                    "You have an appointment with us on " + day + ", " + month + " " + date + ", at " + times[i] +
                            "m.");
            System.out.println("");
            System.out.println("Please answer with Y to confirm and N to cancel the appointment.");
        }
    }
}
