package org.example.sixthKyu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough6K {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int element : elements) {
            int count = occurrences.getOrDefault(element, 0);
            if (count < maxOccurrences) {
                result.add(element);
                occurrences.put(element, count + 1);
            }
        }

        int[] res = result.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }


}
