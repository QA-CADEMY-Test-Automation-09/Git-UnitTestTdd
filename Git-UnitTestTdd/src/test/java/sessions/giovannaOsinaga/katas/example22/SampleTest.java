package sessions.giovannaOsinaga.katas.example22;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        String message = "Should handle even string";
        assertEquals("[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)), message);
        assertEquals("[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)), message);
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        String message = "Should handle odd string";
        assertEquals("[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)), message);
        assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)),message );
    }
}
