package test.java.sessions.fabiolaMonrroy.katas.example16;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int northCount = 0;
        int southCount = 0;
        int eastCount = 0;
        int westCount = 0;

        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    northCount++;
                    break;
                case 's':
                    southCount++;
                    break;
                case 'e':
                    eastCount++;
                    break;
                case 'w':
                    westCount++;
                    break;
                default:
                    return false; // Invalid direction
            }
        }

        return northCount == southCount && eastCount == westCount; // Check if you end up at the starting point
    }
}
