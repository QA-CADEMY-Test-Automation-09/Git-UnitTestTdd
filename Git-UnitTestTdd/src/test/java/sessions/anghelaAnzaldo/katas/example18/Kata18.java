package sessions.anghelaAnzaldo.katas.example18;

import java.util.HashSet;

public class Kata18 {
    public static char findMissingLetter(char[] array)
    {
        HashSet<Character> letterHas= new HashSet<>();
        for (char let : array){
            letterHas.add(let);
        }
        for (int i = 0; i < array.length - 1; i++) {
            char currentLetter = array[i];
            char nextLetter = (char) (currentLetter + 1);
            if(!letterHas.contains(nextLetter)){
                return nextLetter;
            }
        }
        return ' ';
    }
}
