package org.example;

public class JadenCase7K {
    public static String toJadenCase(String phrase) {
        String finalRes = null;
        if (phrase != null && phrase != "") {
            String [] stringArr = phrase.split("\\s+");
            StringBuilder resultString = new StringBuilder();
            for (String w : stringArr) {
                if (w.length() > 0) {
                    char firstChar = Character.toUpperCase(w.charAt(0));
                    resultString.append(firstChar);
                    if (w.length() > 1) {
                        resultString.append(w.substring(1));
                    }
                    resultString.append(" ");
                }
            }
            finalRes = resultString.toString().trim();
        }
        return  finalRes;
    }
}
