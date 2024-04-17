package sessions.brunoVasquez.katas.example9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {
    @Test
    public void testSolveExample1() {
        // Given
        String input = "our code";

        // When
        String result = Kata.solve(input);

        // Then
        assertEquals("edo cruo", result);
    }

    @Test
    public void testSolveExample2() {
        // Given
        String input = "your code rocks";

        // When
        String result = Kata.solve(input);

        // Then
        assertEquals("skco redo cruoy", result);
    }

    @Test
    public void testSolveExample3() {
        // Given
        String input = "codewars";

        // When
        String result = Kata.solve(input);

        // Then
        assertEquals("srawedoc", result);
    }

    @Test
    public void testSolveWithSpaceAtBeginning() {
        // Given
        String input = " code";

        // When
        String result = Kata.solve(input);

        // Then
        assertEquals(" edoc", result);
    }

}
