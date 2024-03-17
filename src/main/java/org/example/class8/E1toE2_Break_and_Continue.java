package org.example.class8;

public class E1toE2_Break_and_Continue {
    public static void main(String[] args) {
        //Break;
        String[] names = {"James", "Aladin", "Fab", "Iram", "Ana", "Lana"};
        for (String n : names) {
            if (n.equals("Iram")) {
                System.out.println(n);
            }
        }

        //Continue;
        int[] nums = {10, 20, 30, 55, 45, 35, 50, 100};
        for (int n : nums) {
            if (n > 50) {
                continue;
            }
            System.out.println(n + 10);
            System.out.println(n * 10);
            System.out.println(n / 10);
            System.out.println(n % 10);
            System.out.println(n * 20);
            System.out.println("****");
        }
    }
}
