package sessions.gonzaloCondori.katas.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneExampleTests {
    @Test
    public void tests() {
        // Given
        int[] arrayPhoneNumber = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // When
        String actualResult = Kata.createPhoneNumberV1(arrayPhoneNumber);

        // Then
        String expectedResult = "(123) 456-7890";
        assertEquals(expectedResult, actualResult);
    }
}
