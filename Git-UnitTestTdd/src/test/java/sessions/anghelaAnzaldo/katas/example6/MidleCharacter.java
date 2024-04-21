package sessions.anghelaAnzaldo.katas.example6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MidleCharacter {
    @Test
    public void testGetMiddleExample1() {
        // Given
        String word = "test";

        // When
        String result = Kata6.getMiddle(word);

        // Then
        assertEquals("es", result);
    }

    @Test
    public void testGetMiddleExample2() {
        // Given
        String word = "testing";

        // When
        String result = Kata6.getMiddle(word);

        // Then
        assertEquals("t", result);
    }

    @Test
    public void testGetMiddleExample3() {
        // Given
        String word = "middle";

        // When
        String result = Kata6.getMiddle(word);

        // Then
        assertEquals("dd", result);
    }

    @Test
    public void testGetMiddleSingleCharacter() {
        // Given
        String word = "A";

        // When
        String result = Kata6.getMiddle(word);

        // Then
        assertEquals("A", result);
    }
}
