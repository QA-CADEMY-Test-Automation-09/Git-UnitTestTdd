package sessions.anghelaAnzaldo.katas.example16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigits {
    @Test
    public void Test1() {
        assertEquals( 7, Kata16.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( 6, Kata16.digital_root(456));
    }


}
