package sessions.rodrigoAyala.katas.example2;

public class Kata {

    // Function to count the number of occurrences of a character in a string
    public static int countChar(String inputString, char targetChar) {
        // Convert the input string and the target character to lowercase for case-insensitive comparison
        inputString = inputString.toLowerCase();
        char lowerCaseTargetChar = Character.toLowerCase(targetChar);

        // Initialize the count of occurrences
        int count = 0;

        // Iterate through the input string and count occurrences of the target character
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == lowerCaseTargetChar) {
                count++;
            }
        }

        return count;
    }
}
