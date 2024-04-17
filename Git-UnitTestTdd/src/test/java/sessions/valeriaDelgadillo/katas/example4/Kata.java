package sessions.valeriaDelgadillo.katas.example4;

public class Kata {
    public static String camelCase(String str) {

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
            }
        }
        return result.toString();
    }
}
