package test.java.sessions.fabiolaMonrroy.katas.example13;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StringSplitterTest {
    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("Should handle even string", "[ab, cd, ef]", Arrays.toString(StringSplitter.solution(s)));
        assertEquals("Should handle even string", "[He, ll, oW, or, ld]", Arrays.toString(StringSplitter.solution(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("Should handle odd string", "[ab, cd, e_]", Arrays.toString(StringSplitter.solution(s)));
        assertEquals("Should handle odd string", "[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplitter.solution(s1)));
    }
}
