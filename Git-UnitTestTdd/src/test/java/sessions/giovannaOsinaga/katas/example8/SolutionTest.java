package sessions.giovannaOsinaga.katas.example8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void exampleTests() {

        char[] arrayLetters = new char[] { 'a','b','c','d','f' };
        assertEquals('e', Kata.findMissingLetter(arrayLetters));

    }
    @Test
    public void exampleTests2() {

        char[] arrayLetters = new char[] { 'O','Q','R','S' };
        assertEquals('P', Kata.findMissingLetter(arrayLetters));
    }
}
