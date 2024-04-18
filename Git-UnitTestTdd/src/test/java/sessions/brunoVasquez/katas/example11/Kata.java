package sessions.brunoVasquez.katas.example11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Kata {

    /**
     *
     * @param array
     * @return
     */
    public static int findSmallestInt(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int findSmallestIntUsingStream(int[] array) {
        // Find the smallest integer using streams
        return Arrays.stream(array)
                .min()
                .getAsInt();
    }

}
