package sessions.giovannaOsinaga.katas.example3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void test1() {
        assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    @Test
    public void test2() {
        assertEquals("3 1", Kata.highAndLow("1 2 3"));
    }
    @Test
    public void test3() {
        assertEquals("5 1", Kata.highAndLow("1 2 3 4 5"));
    }
    @Test
    public void test4() {
        assertEquals("5 -3", Kata.highAndLow("1 2 -3 4 5"));
    }
    @Test
    public void test5() {
        assertEquals("9 -5", Kata.highAndLow("1 9 3 4 -5"));
    }
}
