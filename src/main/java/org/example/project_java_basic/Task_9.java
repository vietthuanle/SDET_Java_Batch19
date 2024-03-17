package org.example.project_java_basic;

public class Task_9 {
    public static void main(String[] args) {
        int[] nums = {1, 56, 250, 24, 246, 23, 63, 256};
        int largest = nums[0];
        int second = nums[0];
        for (int n : nums) {
            if (largest < n) {
                largest = n;
            }
        }
        for (int n : nums) {
            if (n != largest && second < n) {
                second = n;
            }
        }
        System.out.println("Second largest number is the array is " + second);
    }
}
