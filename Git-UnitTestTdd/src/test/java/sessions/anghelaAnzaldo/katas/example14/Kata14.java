package sessions.anghelaAnzaldo.katas.example14;

import java.util.HashSet;

public class Kata14 {
    public boolean check(String sentence){
        boolean result = false;
        sentence = sentence.toLowerCase();
        HashSet<Character> alphabetSet = new HashSet<>();

        for (char chars:sentence.toCharArray()){
            if(Character.isLetter(chars)){
                alphabetSet.add(chars);
            }

        }
        if(alphabetSet.size()==26)
            return true;
        else
            return result;

    }
}
