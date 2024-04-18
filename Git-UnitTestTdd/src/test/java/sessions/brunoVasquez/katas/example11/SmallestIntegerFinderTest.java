package sessions.brunoVasquez.katas.example11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestIntegerFinderTest {
    @Test
    public void testFindSmallestIntClassicSolution() {
        // Given
        int[] input1 = {34, 15, 88, 2};
        int[] input2 = {34, -345, -1, 100};

        // When
        int result1 = Kata.findSmallestInt(input1);
        int result2 = Kata.findSmallestInt(input2);

        // Then
        assertEquals(2, result1);
        assertEquals(-345, result2);
    }

    @Test
    public void testFindSmallestIntStreamSolution() {
        // Given
        int[] input1 = {34, 15, 88, 2};
        int[] input2 = {34, -345, -1, 100};

        // When
        int result1 = Kata.findSmallestIntUsingStream(input1);
        int result2 = Kata.findSmallestIntUsingStream(input2);

        // Then
        assertEquals(2, result1);
        assertEquals(-345, result2);
    }

    @Test
    public void testFindSmallestIntSingleElement() {
        // Given
        int[] input = {5};

        // When
        int result = Kata.findSmallestInt(input);

        // Then
        assertEquals(5, result);
    }

    @Test
    public void testFindSmallestIntAllNegative() {
        // Given
        int[] input = {-10, -5, -20, -15};

        // When
        int result = Kata.findSmallestInt(input);

        // Then
        assertEquals(-20, result);
    }
}
