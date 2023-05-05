package org.example.sixthKyu;

public class PersistentBugger6K {
    public static int persistence(long n) {
        long num = n;
        int counter = 0;
        while (num > 9) {
            String numberAsString = Long.toString(num);
            int[] digits = new int[numberAsString.length()];
            for (int i = 0; i < numberAsString.length(); i++) {
                digits[i] = Character.getNumericValue(numberAsString.charAt(i));
            }
            num = 1;
            for (int nUm : digits) {
                num *= nUm;
            }

            counter++ ;
        }
        return counter;
    }
}
