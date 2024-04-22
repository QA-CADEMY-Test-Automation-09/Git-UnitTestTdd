package sessions.giovannaOsinaga.katas.example9;

public class Solution {
    public static String solve(String word){

        String finalWord ="";

        StringBuilder builder = new StringBuilder(word);
        String invertedWord = builder.reverse().toString();

        StringBuilder builder2 = new StringBuilder(invertedWord.replace(" ",""));

        if(invertedWord.contains(" ")){
            for (int i = 0; i < word.length(); i++) {

                if (Character.isWhitespace(word.charAt(i))){
                    finalWord = builder2.insert(i," ").toString();
                }
            }
        }
        else {
            finalWord = invertedWord;
        }
        return finalWord;
    }
}
