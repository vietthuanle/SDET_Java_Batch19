package org.example.project_java_basic;

public class Task_8 {
    public static void main(String[] args) {
        int[] nums = {23, -63, 1, 56, 24, 246, 256};
        int max = nums[0];
        int min = nums[0];
        for (int n : nums) {
            if (max < n) {
                max = n;
            }
            if (min > n) {
                min = n;
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
