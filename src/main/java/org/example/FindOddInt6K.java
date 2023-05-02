package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindOddInt6K {
    public static int findIt(int[] a) {
        int result = 0;
        for (int num : a) {
            result ^= num; // используем операцию XOR для подсчета количества вхождений
        }
        return result;
    }
}
