package sessions.giovannaOsinaga.katas.example4;


public class Solution {
    public static String camelCase(String str) {
      String [] strArray = str.trim().split(" ");
        String resultCamel = "";
        for (String word: strArray){
            if(!word.isEmpty()){
               resultCamel = resultCamel + convert(word);
            }
        }

        return resultCamel;
    }

    public static String convert(String str) {
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        return str;

    }

}
