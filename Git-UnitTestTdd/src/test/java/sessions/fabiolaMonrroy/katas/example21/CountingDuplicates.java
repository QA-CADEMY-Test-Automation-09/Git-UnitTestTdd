package test.java.sessions.fabiolaMonrroy.katas.example21;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String lowerCaseText = text.toLowerCase();

        Map<Character, Integer> charFrequencies = new HashMap<>();

        for (char c : lowerCaseText.toCharArray()) {
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        int duplicateCount = 0;
        for (int frequency : charFrequencies.values()) {
            if (frequency > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
}
