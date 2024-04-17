package test.java.sessions.fabiolaMonrroy.katas.example19;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingLetter {
    public static String firstNonRepeatingLetter(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        String lowercaseStr = str.toLowerCase();

        for (char c : lowercaseStr.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (freqMap.get(Character.toLowerCase(c)) == 1) {
                return Character.toString(c);
            }
        }

        return "";
    }
}
