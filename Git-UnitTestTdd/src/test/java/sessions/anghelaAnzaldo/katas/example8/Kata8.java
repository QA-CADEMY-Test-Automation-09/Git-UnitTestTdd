package sessions.anghelaAnzaldo.katas.example8;

import java.util.stream.IntStream;

public class Kata8 {
    public static char findMissingLetter(char[] array) {
        char missingLetter = ' ';

        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                missingLetter = (char) (array[i - 1] + 1);
                break;
            }
        }

        return missingLetter;
    }

    public static char findMissingLetterUsingIntStream(char[] array) {
        // Given: Find the missing letter using Java Streams
        return (char) IntStream.range(1, array.length)
                .filter(i -> array[i] - array[i - 1] != 1)
                .map(i -> array[i - 1] + 1)
                .findFirst()
                .orElse(' ');
    }
}
