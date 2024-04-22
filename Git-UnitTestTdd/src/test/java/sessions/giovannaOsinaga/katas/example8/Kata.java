package sessions.giovannaOsinaga.katas.example8;

public class Kata {
    public static char findMissingLetter(char[] array)
    {
        char missLetter = ' ';

        char firstLetter = array[0];
        char lastLetter = array[array.length - 1];

        for (char i = firstLetter; i <= lastLetter ; i++) {
            for (char arrayIncomplete: array){
                if(arrayIncomplete != i){
                    missLetter = i;
                    break;
                }
                else {
                    i++;
                }
            }
            break;
        }
        return missLetter;
    }
}
