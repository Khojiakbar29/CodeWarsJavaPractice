package org.example.sixthKyu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestConsec6K {
    public static String longestConsec(String[] strarr, int k) {
        String res = "";
        if (k > strarr.length || k <= 0) {
            return  res;
        }
        Arrays.sort(strarr, Comparator.comparingInt(String::length).reversed());
        // сохраняем порядок совпадающих элементов с помощью Map
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < strarr.length; i++) {
            map.putIfAbsent(strarr[i], i);
        }
        String[] sortedArr = map.keySet().toArray(new String[strarr.length]);
        System.out.println(Arrays.toString(sortedArr));
        if (k == 1) {
            res += strarr[strarr.length - 1];
        } else if ( k > 1) {
            for (int i = 0; i < k; i++) {
                res += strarr[i];
                if(res.contains(strarr[i])) {
                    res += strarr[i+1];
                } else {
                    res += strarr[i];
                }
            }
        }
        return  res;
    }
}
