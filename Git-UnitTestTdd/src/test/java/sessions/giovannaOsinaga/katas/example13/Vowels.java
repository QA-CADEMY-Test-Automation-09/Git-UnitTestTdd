package sessions.giovannaOsinaga.katas.example13;

public class Vowels {

    public static int getCount(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char currentWord = sentence.charAt(i);
            if (currentWord == 'a' || currentWord == 'e' || currentWord == 'i' || currentWord == 'o' || currentWord == 'u'){
                count++;
            }

        }
        return count;
    }

}
