package sessions.anghelaAnzaldo.katas.example6;

public class Kata6 {
    public static String getMiddle(String word) {
        int length = word.length();
        int middleLength = length / 2;
        if (length % 2 == 0) {
            return word.substring(middleLength - 1, middleLength + 1);
        } else {
            return word.substring(middleLength, middleLength + 1);
        }
    }

    public static String getMiddleUsingTernaryOperator(String word) {
        int length = word.length();
        int middleLength = length / 2;
//        String middelString = length % 2 == 0?
//                word.substring(middleLength - 1, middleLength + 1) :
//                word.substring(middleLength, middleLength + 1);
        return length % 2 == 0 ?
                word.substring(middleLength - 1, middleLength + 1) :
                word.substring(middleLength, middleLength + 1);
    }
}
