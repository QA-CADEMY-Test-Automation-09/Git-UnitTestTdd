package sessions.giovannaOsinaga.katas.example10;

public class Kata {
    public static int findShort(String sentence) {

        String[] wordArray = sentence.split(" ");

        int sizeMostShort = wordArray[0].length();


        for (String findWordArray : wordArray){
            int sizeWordArray = findWordArray.length();
            if (sizeWordArray < sizeMostShort){
                sizeMostShort = sizeWordArray;
            }

        }
        return sizeMostShort;
    }
}
