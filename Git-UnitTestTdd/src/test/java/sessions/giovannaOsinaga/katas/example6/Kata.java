package sessions.giovannaOsinaga.katas.example6;

public class Kata {
    public static String getMiddle(String word) {
        int sizeWord = word.length();
        String middleText = "";
        int division =  sizeWord / 2;


        if(sizeWord % 2 == 0){
            middleText = String.valueOf((word.charAt(division -1))) + String.valueOf((word.charAt(division)));
        }
        else {
            middleText = String.valueOf((word.charAt(division)));
        }
        return middleText;
    }
}
