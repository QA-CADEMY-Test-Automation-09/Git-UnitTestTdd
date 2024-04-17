package sessions.valeriaDelgadillo.katas.example7;
import java.util.*;

public class Kata {
    public static int[] sortArray(int[] array) {

        List<Integer> oddNumbers = new ArrayList<>();

        for (int num : array) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        Collections.sort(oddNumbers);

        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers.get(oddIndex++);
            }
        }
        return array;

    }
}