package sessions.giovannaOsinaga.katas.example22;


public class StringSplit {
    public static String[] solution(String sentence) {

        int size = sentence.length();
        String[] array = new String[size / 2];

        if (size % 2 == 1){
            sentence += '_';
            size = sentence.length();
            array = new String[size/2];
        }
        for (int i = 0; i < size; i += 2) {
            array[i / 2] = sentence.substring(i, i + 2);
        }
        return array;
    }
}
