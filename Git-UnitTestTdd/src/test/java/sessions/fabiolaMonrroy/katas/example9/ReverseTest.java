package test.java.sessions.fabiolaMonrroy.katas.example9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {
    @Test
    public void basicTests() {
        assertEquals("srawedoc", Reverse.solve("codewars"));
        assertEquals("edoc ruoy", Reverse.solve("your code"));
        assertEquals("skco redo cruoy", Reverse.solve("your code rocks"));
    }
}
