package org.example.project_java_basic;

public class Task_3 {
    public static void main(String[] args) {
        int[][] nums = {
                {72, 14, 85, 4, 144, 29, 1128},
                {156, 518, 12, 84, 3, 45, 940},
                {4, 21, 453, 56, 42, 59, 1}
        };
        System.out.println("The even numbers are:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    System.out.print(nums[i][j] + " ");
                }
            }
        }
    }
}
