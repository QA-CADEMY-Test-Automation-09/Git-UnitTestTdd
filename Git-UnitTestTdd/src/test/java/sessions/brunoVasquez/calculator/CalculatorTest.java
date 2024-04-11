package sessions.brunoVasquez.calculator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expectedResult = 5;
        assertEquals(expectedResult, calculator.add(1, 3));
    }

    @Test
    public void testSubtract() {
        int expectedResult = 2;
        assertEquals(expectedResult, calculator.subtract(5, 3));
    }
}
