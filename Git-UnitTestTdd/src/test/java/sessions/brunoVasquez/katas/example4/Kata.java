package sessions.brunoVasquez.katas.example4;

public class Kata {

    public static String camelCase(String input) {
        // Split the input string by space
        String[] words = input.split(" ");

        // Initialize the result string
        StringBuilder result = new StringBuilder();

        // Capitalize the first letter of each word and append to result
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1));
            }
        }

        return result.toString();
    }
}
