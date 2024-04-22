package sessions.giovannaOsinaga.katas.example20;

public class Solution {
    static String toCamelCase(String sentence){

        String wordWithoutChar = sentence.replace("-"," ").replace("_"," ");
        String[] wordArray = wordWithoutChar.split(" ");
        StringBuilder  result = new StringBuilder();

        for (int i = 0; i < wordArray.length; i++) {
            if (i == 0){
                result.append(wordArray[0]);
            }
            else {
                result.append(Character.toUpperCase(wordArray[i].charAt(0)));
                result.append(wordArray[i].substring(1).toLowerCase());
            }
        }
        return result.toString();
    }
}
