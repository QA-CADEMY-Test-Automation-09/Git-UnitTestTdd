package sessions.giovannaOsinaga.katas.example17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitCountingTest {
    @Test
    public void testGame01() {
        int number = 1234;
        int actual = BitCounting.countBits(number);
        int expected = 5;
    }
    @Test
    public void testGame02() {
        int number = 4;
        int actual = BitCounting.countBits(number);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testGame03() {
        int number = 7;
        int actual = BitCounting.countBits(number);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void testGame04() {
        int number = 9;
        int actual = BitCounting.countBits(number);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void testGame05() {
        int number = 10;
        int actual = BitCounting.countBits(number);
        int expected = 2;
        assertEquals(expected, actual);
    }
}
