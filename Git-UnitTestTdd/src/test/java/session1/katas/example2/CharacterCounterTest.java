package session1.katas.example2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCounterTest {
    @Test
    public void testCountCharExample1() {
        // Given
        String inputString = "fizzbuzz";
        char targetChar = 'z';

        // When
        int result = Kata.countChar(inputString, targetChar);

        // Then
        assertEquals(4, result);
    }

    @Test
    public void testCountCharExample2() {
        // Given
        String inputString = "Fancy fifth fly aloof";
        char targetChar = 'f';

        // When
        int result = Kata.countChar(inputString, targetChar);

        // Then
        assertEquals(5, result);
    }

}
