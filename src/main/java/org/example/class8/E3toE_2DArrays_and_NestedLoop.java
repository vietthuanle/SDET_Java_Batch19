package org.example.class8;

public class E3toE_2DArrays_and_NestedLoop {
    public static void main(String[] args) {
       /*
                        2D Arrays
       //10 20 40 50
       //22 40 90 65
       //15 50 33 30

       int[][] matrix = {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30}
        };
        System.out.println(matrix[1][2]);

                        Nested Loop
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        int[][] number = {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}
