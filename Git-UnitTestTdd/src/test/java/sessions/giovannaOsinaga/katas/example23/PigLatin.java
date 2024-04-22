package sessions.giovannaOsinaga.katas.example23;

public class PigLatin {
    public static String pigIt(String sentence) {
        String[] words = sentence.split(" ");
        String newWord = "";
        String patern = "^[^A-Za-z].*";
        for ( String word: words){

            if (word.matches(patern)){
                newWord = newWord + word;
            }
            else {
                char firstLetter = word.charAt(0);
                String restWord = word.substring(1);
                newWord += restWord + firstLetter + "ay ";
            }
        }
        return newWord.trim();
    }
}
