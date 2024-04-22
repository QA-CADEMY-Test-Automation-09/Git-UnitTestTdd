package sessions.giovannaOsinaga.katas.example18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeNegativeTest {
    @Test
    public void test1() {
        int number = 42;
        int actual = Kata.makeNegative(number);
        assertEquals(-42, actual);
    }
    @Test
    public void test2() {
        int number = -5;
        int actual = Kata.makeNegative(number);
        assertEquals(-5, actual);
    }
    @Test
    public void test3() {
        int number = 0;
        int actual = Kata.makeNegative(number);
        assertEquals(0, actual);
    }
}
