package sessions.anghelaAnzaldo.katas.example12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersistenceBugger {
    @Test
    public void testPersistenceClassicSolution() {
        // Given
        int input1 = 39;
        int input2 = 999;
        int input3 = 4;

        // When
        int result1 = Kata12.persistence(input1);
        int result2 = Kata12.persistence(input2);
        int result3 = Kata12.persistence(input3);

        // Then
        assertEquals(3, result1);
        assertEquals(4, result2);
        assertEquals(0, result3);
    }

    @Test
    public void testPersistenceSingleDigit() {
        // Given
        int input = 8;

        // When
        int result = Kata12.persistence(input);

        // Then
        assertEquals(0, result);
    }

    @Test
    public void testPersistenceLargeNumber() {
        // Given
        int input = 987654321;

        // When
        int result = Kata12.persistence(input);

        // Then
        assertEquals(2, result);
    }
}
