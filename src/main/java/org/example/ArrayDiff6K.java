package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiff6K {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list1 = new ArrayList<>();
        for (int i : a) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i : b) {
            list2.add(i);
        }
        list1.removeAll(list2);
        int [] res = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            res[i] = list1.get(i);
        }
        return res;
    }
}
