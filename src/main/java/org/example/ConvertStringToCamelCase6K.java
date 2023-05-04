package org.example;

public class ConvertStringToCamelCase6K {
    static String toCamelCase(String s){
        String[] strArr = s.split("[\\s-_]+");
        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]);
        for (int i = 1; i< strArr.length; i++) {
            String capitalW =strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
            sb.append(capitalW);
        }
        return sb.toString().trim();
    }
}
