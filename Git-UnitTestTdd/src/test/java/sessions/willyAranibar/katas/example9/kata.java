package sessions.willyAlejandro.katas.example9;

import java.util.stream.IntStream;

public class Kata {
    public static String solve(String str) {
        // Convert the string to char array to allow modifications
        char[] reversed = str.toCharArray();

        // Initialize pointers for the start and end of the string
        int start = 0;
        int end = reversed.length - 1;

        // Iterate through the string to reverse it while maintaining spaces
        while (start < end) {
            // Skip spaces from the start
            while (reversed[start] == ' ') {
                start++;
            }
            // Skip spaces from the end
            while (reversed[end] == ' ') {
                end--;
            }
            // Swap characters at start and end if they are not spaces
            if (reversed[start] != ' ' && reversed[end] != ' ') {
                char temp = reversed[start];
                reversed[start] = reversed[end];
                reversed[end] = temp;
            }
            // Move pointers towards the center
            start++;
            end--;
        }

        // Convert char array back to string
        return new String(reversed);
    }

}
