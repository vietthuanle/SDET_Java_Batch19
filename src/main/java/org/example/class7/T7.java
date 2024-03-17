package org.example.class7;

import java.util.Arrays;

public class T7 {
    public static void main(String[] args) {
        char[] values = {'a', 't', 'y', 'b'};
        char[] reverse = new char[values.length];
        int i = values.length;
        for (char c : values) {
            i--;
            reverse[i] = c;
        }
        System.out.println(Arrays.toString(reverse));

        char[] secondValues = {'1', '2', '3', '4'};
        for (int x = secondValues.length - 1; x >= 0; x--) {
            System.out.println(secondValues[x]);
        }
    }
}
