package sessions.brunoVasquez.katas.example8;
import java.util.stream.IntStream;

/**
 * Both solutions achieve the same result, finding the missing letter in an array of consecutive letters.
 * The choice between them depends on factors such as readability, maintainability, and personal preference.
 *
 * The solution using Java 8 Streams is concise and expressive. It leverages built-in stream operations for filtering,
 * mapping, and finding the missing letter, which can make the code more readable and easier to understand for developers familiar with functional programming concepts.
 * However, it may not be as familiar to developers who are not yet comfortable with Java 8 Streams.
 *
 * On the other hand, the solution without using streams is more traditional and straightforward.
 * It uses a loop to iterate over the array and find the missing letter,
 * which may be more intuitive for developers who are not familiar with Java 8 Streams or prefer a more imperative style of programming.
 *
 * In terms of performance, both solutions have similar time complexity,
 * so there shouldn't be a significant difference in execution time between them for arrays of reasonable size.
 *
 * Overall, the better solution depends on the specific context of the project, the team's familiarity with Java 8 Streams,
 * and the coding style preferences of the developers involved. Both solutions are valid and effective,
 * so you can choose the one that best fits your needs and the requirements of your project.
 */
public class Kata {

    public static char findMissingLetter(char[] array) {
        char missingLetter = ' ';

        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                missingLetter = (char) (array[i - 1] + 1);
                break;
            }
        }

        return missingLetter;
    }

    public static char findMissingLetterUsingIntStream(char[] array) {
        // Given: Find the missing letter using Java Streams
        return (char) IntStream.range(1, array.length)
                .filter(i -> array[i] - array[i - 1] != 1)
                .map(i -> array[i - 1] + 1)
                .findFirst()
                .orElse(' ');
    }
}
