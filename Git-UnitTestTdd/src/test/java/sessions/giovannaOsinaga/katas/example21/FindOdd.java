package sessions.giovannaOsinaga.katas.example21;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class FindOdd {
    public static int findIt(int[] array) {
       int occurrences = 0;
       int oddNumber = 0;
       List<Integer> numberList = new ArrayList<>();

        for (int number : array){
                numberList.add(number);
        }
        Set<Integer> uniqueNumber = new HashSet<>(numberList);
        for (int uNumber : uniqueNumber){
            occurrences = Collections.frequency(numberList,uNumber);
            if (occurrences % 2 == 1){
                 oddNumber = uNumber;
            }
        }
        return oddNumber;
    }
}
