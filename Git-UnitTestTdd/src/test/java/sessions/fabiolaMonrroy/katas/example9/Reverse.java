package test.java.sessions.fabiolaMonrroy.katas.example9;

public class Reverse {
    public static String solve(String str) {
        char[] reversed = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                reversed[i] = ' ';
            }
        }

        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                while (reversed[j] == ' ') {
                    j--;
                }
                reversed[j--] = str.charAt(i);
            }
        }
        return new String(reversed);
    }
}
