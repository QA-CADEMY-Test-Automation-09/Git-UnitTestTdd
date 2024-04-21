package sessions.anghelaAnzaldo.katas.example20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequence {
    @Test
    public void fixedTests() {

        //Given
        String a="";
        String b="";
        //When
        String result = Kata20.lcs(a, b);
        //Then
        assertEquals("",result );
        //Given
        String abc="abc";
        String e="";
        //When
        String result2 = Kata20.lcs(abc, e);
        //Then
        assertEquals("", result2);

        assertEquals("", Kata20.lcs("", "abc"));
        assertEquals("", Kata20.lcs("a", "b"));
        assertEquals("a", Kata20.lcs("a", "a"));
        assertEquals("ac", Kata20.lcs("abc", "ac"));
        assertEquals("abc", Kata20.lcs("abcdef", "abc"));
        assertEquals("acf", Kata20.lcs("abcdef", "acf"));
        assertEquals("nottest", Kata20.lcs("anothertest", "notatest"));
        assertEquals("12356", Kata20.lcs("132535365", "123456789"));
        assertEquals("final", Kata20.lcs("nothardlythefinaltest", "zzzfinallyzzz"));
        assertEquals("acdefghijklmnoq", Kata20.lcs("abcdefghijklmnopq", "apcdefghijklmnobq"));
    }
}
