package org.example.class7;

public class T6 {
    public static void main(String[] args) {
        int[] nums = {2212, 89, 734, 56};
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println(largest);
    }
}
