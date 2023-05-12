package org.example.sixthKyu;

public class ExpandedForm6K {
    public static String expandedForm(int num) {
        String someStr = Integer.toString(num);
        StringBuilder result = new StringBuilder();
        int factor = (int) Math.pow(10, someStr.length() - 1);
        for (int i = 0; i < someStr.length(); i++) {
            int digit = Character.getNumericValue(someStr.charAt(i));
            if (digit != 0) {
                result.append(digit * factor);
                if (i < someStr.length() - 1) {
                    result.append(" + ");
                }
            }
            factor /= 10;
        }
        if (someStr.charAt(someStr.length() - 1) == '0') {
            result.delete(result.length() - 3, result.length());
        }

        return result.toString();
    }
}
