package test.java.sessions.fabiolaMonrroy.katas.example4;

public class Solution {
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String camelCase(String str) {
        String newString = "";
        for (int i = 0; i < str.split(" ").length; i++) {
            String arrayItem = str.split(" ")[i];
            String capitalizeStringItem = capitalize(arrayItem);
            newString = newString.concat(capitalizeStringItem);
        }
        return newString.trim();

    }
}
