package org.example.sixthKyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AreSame6K {
    public static boolean comp(int[] a, int[] b) {
        Map<Integer, Integer> countMap1 = getElementCounts(a);
        Map<Integer, Integer> countMap2 = getElementCounts(b);

        int[] countArray1 = getCountArray(countMap1);
        int[] countArray2 = getCountArray(countMap2);

        return Arrays.equals(countArray1, countArray2);
    }

    private static Map<Integer, Integer> getElementCounts(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int element : arr) {
            int count = countMap.getOrDefault(element, 0);
            countMap.put(element, count + 1);
        }
        return countMap;
    }

    private static int[] getCountArray(Map<Integer, Integer> countMap) {
        int[] countArray = new int[countMap.size()];
        int i = 0;
        for (int count : countMap.values()) {
            countArray[i++] = count;
        }
        Arrays.sort(countArray);
        return countArray;
    }
}
