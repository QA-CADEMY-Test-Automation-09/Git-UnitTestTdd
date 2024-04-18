package sessions.brunoVasquez.katas.example10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordFinderTest {

    @Test
    public void testFindShortClassicSolution() {
        // Given
        String input = "The quick brown fox";

        // When
        int result = Kata.findShort(input);

        // Then
        assertEquals(3, result);
    }

    @Test
    public void testFindShortStreamSolution() {
        // Given
        String input = "The quick brown fox";

        // When
        int result = Kata.findShortUsingStream(input);

        // Then
        assertEquals(3, result);
    }

    @Test
    public void testFindShortEmptyString() {
        // Given
        String input = "";

        // When
        int result = Kata.findShort(input);

        // Then
        assertEquals(0, result);
    }

    @Test
    public void testFindShortSingleWord() {
        // Given
        String input = "Hello";

        // When
        int result = Kata.findShort(input);

        // Then
        assertEquals(5, result);
    }
}
