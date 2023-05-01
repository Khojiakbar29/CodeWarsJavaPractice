package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering7K {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();
        for (Object item : list) {
            if (item instanceof Integer) {
                result.add(item);
            }
        }
        return result;
    }
}
