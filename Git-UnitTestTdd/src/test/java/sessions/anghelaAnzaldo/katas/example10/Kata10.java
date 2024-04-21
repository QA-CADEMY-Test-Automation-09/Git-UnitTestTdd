package sessions.anghelaAnzaldo.katas.example10;

import java.util.Arrays;

public class Kata10 {
    public static int findShort(String stringWords) {
        // Apply Split to string
        String[] words = stringWords.split(" ");
        int shortest = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() < shortest) {
                shortest = word.length();
            }
        }
        return shortest;
    }

    public static int findShortUsingStream(String stringWords) {
        // Split the string into an array of words, then find the minimum length using streams
        return Arrays.stream(stringWords.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
