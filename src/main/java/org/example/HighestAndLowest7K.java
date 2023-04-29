package org.example;

import java.util.Arrays;

public class HighestAndLowest7K {
    public static String highAndLow(String numbers) {
        String[] nums = numbers.split(" ");
        int max = Integer.parseInt(nums[0]);
        int min = Integer.parseInt(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return String.format("%d %d", max, min);
    }
}
