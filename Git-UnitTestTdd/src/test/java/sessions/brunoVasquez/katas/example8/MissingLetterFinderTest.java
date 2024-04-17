package sessions.brunoVasquez.katas.example8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingLetterFinderTest {
    @Test
    public void testFindMissingLetter_GivenExample1() {
        // Given
        char[] array = {'a', 'b', 'c', 'd', 'f'};

        // When
        char result = Kata.findMissingLetter(array);

        // Then
        assertEquals('e', result);
    }

    @Test
    public void testFindMissingLetter_GivenExample2() {
        // Given
        char[] array = {'O', 'Q', 'R', 'S'};

        // When
        char result = Kata.findMissingLetter(array);

        // Then
        assertEquals('P', result);
    }

    @Test
    public void testFindMissingLetter_UpperCase() {
        // Given
        char[] array = {'A', 'B', 'C', 'D', 'F'};

        // When
        char result = Kata.findMissingLetter(array);

        // Then
        assertEquals('E', result);
    }

    @Test
    public void testFindMissingLetter_LowerCase() {
        // Given
        char[] array = {'a', 'b', 'c', 'd', 'f'};

        // When
        char result = Kata.findMissingLetter(array);

        // Then
        assertEquals('e', result);
    }
}
