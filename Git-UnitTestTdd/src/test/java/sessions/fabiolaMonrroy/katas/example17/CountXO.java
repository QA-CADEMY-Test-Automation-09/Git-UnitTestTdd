package test.java.sessions.fabiolaMonrroy.katas.example17;

public class CountXO {
    public static boolean getXO(String str) {

        str = str.toLowerCase();

        int countX = 0;
        int countO = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'x') {
                countX++;
            } else if (ch == 'o') {
                countO++;
            }
        }

        return countX == countO;
    }
}
