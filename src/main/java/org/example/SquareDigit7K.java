package org.example;

public class SquareDigit7K {
    public int squareDigits(int n) {
        String strNum = String.valueOf(n);
        char[] charNum = strNum.toCharArray();
        int[] intNums = new int[charNum.length];
        String res = String.valueOf(0);
        for (int i = 0; i < charNum.length; i++) {
            intNums[i] = Character.getNumericValue(charNum[i]);
        }
        for (int num : intNums) {
            res += num * num;
        }
        return Integer.parseInt(res);
    }
}

//The best sollution
//public int squareDigits(int n) {
//    return Integer.parseInt(String.valueOf(n)
//            .chars()
//            .map(i -> Integer.parseInt(String.valueOf((char) i)))
//            .map(i -> i * i)
//            .mapToObj(String::valueOf)
//            .collect(Collectors.joining("")));
//}
