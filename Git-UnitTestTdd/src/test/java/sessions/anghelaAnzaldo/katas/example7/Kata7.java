package sessions.anghelaAnzaldo.katas.example7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata7 {
    public static int[] sortArray(int[] array) {
        List<Integer> oddNumbers = new ArrayList<>();

        // Given: Collect odd numbers and their indexes
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbers.add(array[i]);
            }
        }

        // When: Sort the odd numbers
        Collections.sort(oddNumbers);

        // Then: Replace odd numbers in the original array with the sorted ones
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers.get(j++);
            }
        }

        return array;
    }

    public static int[] sortArrayUsingStream(int[] array) {
        // Given: Filter odd numbers and collect them into a list
        int[] oddNumbers = Arrays.stream(array)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();

        // Then: Replace odd numbers in the original array with the sorted ones
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers[j++];
            }
        }

        return array;
    }
}
