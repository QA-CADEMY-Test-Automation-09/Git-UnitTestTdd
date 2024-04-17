package test.java.sessions.fabiolaMonrroy.katas.example14;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountBitsTest {
    @Test
    public void testGame() {
        assertEquals(5, CountBits.countBits(1234));
        assertEquals(1, CountBits.countBits(4));
        assertEquals(3, CountBits.countBits(7));
        assertEquals(2, CountBits.countBits(9));
        assertEquals(2, CountBits.countBits(10));
    }
}
