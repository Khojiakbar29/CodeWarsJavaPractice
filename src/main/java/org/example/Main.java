package org.example;

import org.example.sixthKyu.TwoSum6K;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] some = new int[]{2, 2, 3};
        int num = 4;
        int [] res = TwoSum6K.twoSum(some, num);
        System.out.println(Arrays.toString(res));
    }
}




