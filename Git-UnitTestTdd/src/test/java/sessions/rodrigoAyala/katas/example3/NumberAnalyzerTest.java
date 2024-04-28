package sessions.rodrigoAyala.katas.example3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberAnalyzerTest {

    @Test
    public void testHighAndLow_Example1() {
        // Given
        String numbers = "1 2 3 4 5";

        // When
        String result = Kata.highAndLow(numbers);

        // Then
        assertEquals("5 1", result);
    }

    @Test
    public void testHighAndLow_Example2() {
        // Given
        String numbers = "1 2 -3 4 5";

        // When
        String result = Kata.highAndLow(numbers);

        // Then
        assertEquals("5 -3", result);
    }

    @Test
    public void testHighAndLow_Example3() {
        // Given
        String numbers = "1 9 3 4 -5";

        // When
        String result = Kata.highAndLow(numbers);

        // Then
        assertEquals("9 -5", result);
    }

    @Test
    public void testHighAndLow_OneNumber() {
        // Given
        String numbers = "1";

        // When
        String result = Kata.highAndLow(numbers);

        // Then
        assertEquals("1 1", result);
    }

    @Test
    public void testHighAndLow_SameNumbers() {
        // Given
        String numbers = "5 5 5 5 5";

        // When
        String result = Kata.highAndLow(numbers);

        // Then
        assertEquals("5 5", result);
    }
}