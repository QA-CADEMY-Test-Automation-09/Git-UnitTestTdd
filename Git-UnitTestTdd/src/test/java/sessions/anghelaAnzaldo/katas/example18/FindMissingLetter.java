package sessions.anghelaAnzaldo.katas.example18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingLetter {
    @Test
    public void exampleTests() {
        assertEquals('e', Kata18.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata18.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
