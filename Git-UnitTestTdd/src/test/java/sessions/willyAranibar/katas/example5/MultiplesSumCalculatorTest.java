package sessions.willyAranibar.katas.example5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesSumCalculatorTest {
    @Test
    public void testSumMultiplesGivenExample() {
        // Given
        int number = 10;

        // When
        int result = Kata.sumMultiples(number);

        // Then
        assertEquals(23, result);
    }

    @Test
    public void testSumMultiplesNumber15() {
        // Given
        int number = 15;

        // When
        int result = Kata.sumMultiples(number);

        // Then
        assertEquals(45, result);
    }

    @Test
    public void testSumMultiplesNumber20() {
        // Given
        int number = 20;

        // When
        int result = Kata.sumMultiples(number);

        // Then
        assertEquals(78, result);
    }
}
