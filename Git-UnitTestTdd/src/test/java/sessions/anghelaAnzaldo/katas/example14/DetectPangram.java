package sessions.anghelaAnzaldo.katas.example14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetectPangram {
    @Test
    public void test1() {
        //given
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        //when
        Kata14 pc = new Kata14();
        boolean result= pc.check(pangram1);
        //then
        assertEquals(true,result);
    }
    @Test
    public void test2() {
        //Given
        String pangram2 = "You shall not pass!";
        //When
        Kata14 pc = new Kata14();
        boolean result = pc.check(pangram2);
        //Then
        assertEquals(false,result);
    }

}
