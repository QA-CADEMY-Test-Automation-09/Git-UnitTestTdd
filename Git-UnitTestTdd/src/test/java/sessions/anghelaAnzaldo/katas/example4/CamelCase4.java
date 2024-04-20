package sessions.anghelaAnzaldo.katas.example4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCase4 {

    @Test
    public void testCamelCaseExample1() {
        // Given
        String input = "hello case";

        // When
        String result = kata4.camelCase(input);

        // Then
        assertEquals("HelloCase", result);
    }

    @Test
    public void testCamelCaseExample2() {
        // Given
        String input = "camel case word";

        // When
        String result = kata4.camelCase(input);

        // Then
        assertEquals("CamelCaseWord", result);
    }

    @Test
    public void testCamelCaseEmptyString() {
        // Given
        String input = "";

        // When
        String result = kata4.camelCase(input);

        // Then
        assertEquals("", result);
    }

    @Test
    public void testCamelCaseSingleWord() {
        // Given
        String input = "hello";

        // When
        String result = kata4.camelCase(input);

        // Then
        assertEquals("Hello", result);
    }

    @Test
    public void testCamelCase_MultipleSpaces() {
        // Given
        String input = "hello    world";

        // When
        String result = kata4.camelCase(input);

        // Then
        assertEquals("HelloWorld", result);
    }
}
