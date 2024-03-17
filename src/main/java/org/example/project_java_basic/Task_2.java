package org.example.project_java_basic;

public class Task_2 {
    public static void main(String[] args) {
        int[] nums = {72, 14, 85, 4, 144, 29, 1128};
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("The sum is " + sum);
    }
}
