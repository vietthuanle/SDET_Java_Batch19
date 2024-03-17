package org.example.class8;

public class T1 {
    public static void main(String[] args) {
        int[][] number = {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30}
        };
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                total = number[i][j] + total;
            }
        }
        System.out.println(total);
    }
}
