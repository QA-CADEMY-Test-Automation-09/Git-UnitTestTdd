package test.java.sessions.fabiolaMonrroy.katas.example10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindShortTest {
    @Test
    public void findShort() {
        assertEquals(3, FindShort.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, FindShort.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, FindShort.findShort("Let's travel abroad shall we"));
    }
}
