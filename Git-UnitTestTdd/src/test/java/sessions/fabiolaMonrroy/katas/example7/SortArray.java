package test.java.sessions.fabiolaMonrroy.katas.example7;

import java.util.Arrays;

public class SortArray {
    public static int[] sortArray(int[] array) {
        // If the array is empty or null, return it as it is
        if (array == null || array.length == 0) {
            return array;
        }

        // Retrieve and sort the odd numbers
        int[] oddNumbers = Arrays.stream(array)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();

        // Replace odd numbers in the original array with the sorted odd numbers
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers[j++];
            }
        }
        return array;
    }
}
