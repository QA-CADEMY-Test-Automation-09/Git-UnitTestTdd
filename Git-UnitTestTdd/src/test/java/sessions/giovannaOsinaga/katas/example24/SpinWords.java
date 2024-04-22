package sessions.giovannaOsinaga.katas.example24;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] array = sentence.split(" ");
        String invert = "";

        for (String word: array){
            StringBuilder builder = new StringBuilder(word);
            if (word.length() >= 5){
                invert += builder.reverse().toString() + " ";
            }
            else {
                invert += builder.toString() + " ";
            }
        }
        return invert.trim();
    }
}
