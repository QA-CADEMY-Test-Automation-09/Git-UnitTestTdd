package test.java.sessions.fabiolaMonrroy.katas.example13;

public class StringSplitter {
    public static String[] solution(String input) {

        int resultLength = (input.length() + 1) / 2;
        String[] result = new String[resultLength];

        for (int i = 0, j = 0; i < input.length(); i += 2, j++) {

            if (i + 1 < input.length()) {
                result[j] = input.substring(i, i + 2);
            } else {
                result[j] = input.substring(i) + "_";
            }
        }

        return result;
    }

}
