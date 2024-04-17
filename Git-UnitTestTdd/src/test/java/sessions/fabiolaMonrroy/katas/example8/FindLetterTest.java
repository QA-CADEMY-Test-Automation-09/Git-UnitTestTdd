package test.java.sessions.fabiolaMonrroy.katas.example8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindLetterTest {
    @Test
    public void exampleTests() {
        assertEquals('e', FindLetter.findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
        assertEquals('P', FindLetter.findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }

}
