package sessions.valeriaDelgadillo.katas.example4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseMethod {
    @Test
    public void testTwoWords() {
        assertEquals("TestCase", Kata.camelCase("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", Kata.camelCase("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", Kata.camelCase(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", Kata.camelCase("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", Kata.camelCase("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", Kata.camelCase("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", Kata.camelCase(""));
    }
}
