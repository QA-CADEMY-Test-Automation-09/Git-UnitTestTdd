package test.java.sessions.fabiolaMonrroy.katas.example22;

import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String face : arr) {
            if (isValidSmiley(face)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isValidSmiley(String face) {
        if (face.length() == 2) {
            return (face.charAt(0) == ':' || face.charAt(0) == ';') && (face.charAt(1) == ')' || face.charAt(1) == 'D');
        } else if (face.length() == 3) {
            return (face.charAt(0) == ':' || face.charAt(0) == ';') &&
                    (face.charAt(1) == '-' || face.charAt(1) == '~') &&
                    (face.charAt(2) == ')' || face.charAt(2) == 'D');
        } else {
            return false;
        }
    }
}
