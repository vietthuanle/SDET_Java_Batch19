package org.example.class6;

import java.util.Scanner;

public class E1toE12Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // While Loop
        int num=0;
        while (num<2){
            System.out.println(num);
            num++;
        }

        // Do-While Loop
        double num2 = 1;
        do {
            System.out.println(num2);
            num2++;
        }while (num2<10);

        // For Loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("start");
        int s = input.nextInt();
        System.out.println("end");;
        int e = input.nextInt();
        System.out.println("step size");
        int step = input.nextInt();;

        while (s<=e){
            System.out.print(s+" ");
            s+=step;
        }
    }
}
