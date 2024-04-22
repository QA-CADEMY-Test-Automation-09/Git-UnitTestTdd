package sessions.giovannaOsinaga.katas.example14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareDigitTest {
    @Test
    public void test1() {
        int number = 9119;
        int actual = new SquareDigit().squareDigits(number);
        assertEquals(811181, actual);

    }
    @Test
    public void test2() {
        int number = 0;
        int actual = new SquareDigit().squareDigits(number);
        assertEquals(0, actual);
    }
}
