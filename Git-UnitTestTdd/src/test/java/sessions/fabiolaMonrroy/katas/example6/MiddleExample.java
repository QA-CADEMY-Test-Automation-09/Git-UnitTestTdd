package test.java.sessions.fabiolaMonrroy.katas.example6;

public class MiddleExample {
    public static String getMiddle(String word) {
        char[] charArray = word.toCharArray();
        if (charArray.length % 2 == 0) {
            String prevString = (charArray[charArray.length / 2 - 1]) + "";
            String nextString = charArray[charArray.length / 2] + "";
            System.out.println(charArray.length / 2);
            return prevString + nextString;
        } else {

            return charArray[charArray.length / 2] + "";
        }

    }
}
