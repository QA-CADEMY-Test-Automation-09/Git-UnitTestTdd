package sessions.rodrigoAyala.katas.example3;
import java.util.Arrays;
public class Kata {

    /**
     *
     * @param numbers
     * @return
     */
    public static String highAndLow(String numbers) {
        // Split the input string by space to get individual numbers
        String[] numberArray = numbers.split(" ");

        // Convert the string array to an integer array
        int[] intArray = Arrays.stream(numberArray)
                .mapToInt(Integer::parseInt)
                .toArray();

        // Sort the integer array
        Arrays.sort(intArray);

        // Get the highest and lowest numbers
        int highest = intArray[intArray.length - 1];
        int lowest = intArray[0];

        // Return the result as a string
        return highest + " " + lowest;
    }
}
