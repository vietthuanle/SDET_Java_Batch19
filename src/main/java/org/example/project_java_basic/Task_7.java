package org.example.project_java_basic;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 2] + nums[i - 1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
