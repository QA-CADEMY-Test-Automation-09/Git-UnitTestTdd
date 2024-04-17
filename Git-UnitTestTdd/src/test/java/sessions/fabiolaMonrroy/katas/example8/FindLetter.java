package test.java.sessions.fabiolaMonrroy.katas.example8;

public class FindLetter {
    public static char findMissingLetter(char[] array) {
        char missingLetter = ' ';
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                missingLetter = (char) (array[i] + 1);
                break;
            }
        }
        return missingLetter;
    }
}
