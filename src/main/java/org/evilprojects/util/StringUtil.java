package org.evilprojects.util;

public class StringUtil {
    public static String splitWithCommas(String... strings){
        StringBuilder result = new StringBuilder();
        for (String s : strings){
            result.append(s).append(", ");
        }
        return result.toString();
    }

    public static String combineChars(char... chars){
        StringBuilder result = new StringBuilder();
        for (char c : chars){
            result.append(c);
        }
        return result.toString();
    }
}
