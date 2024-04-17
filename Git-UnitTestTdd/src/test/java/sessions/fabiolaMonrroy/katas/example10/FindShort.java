package test.java.sessions.fabiolaMonrroy.katas.example10;

public class FindShort {
    public static int findShort(String s) {

        String[] words = s.split(" ");
        int shortestLength = Integer.MAX_VALUE;
        for (String word : words) {
            shortestLength = Math.min(shortestLength, word.length());
        }
        return shortestLength;
    }
}
