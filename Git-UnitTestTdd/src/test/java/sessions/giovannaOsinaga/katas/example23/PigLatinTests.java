package sessions.giovannaOsinaga.katas.example23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PigLatinTests {
    @Test
    public void FixedTests01() {
        String actual = PigLatin.pigIt("Pig latin is cool");
        String expected = "igPay atinlay siay oolcay";

        assertEquals(expected, actual );
    }
    @Test
    public void FixedTests02() {
        String actual = PigLatin.pigIt("This is my string");
        String expected = "hisTay siay ymay tringsay";
        assertEquals(expected, actual );
    }
    @Test
    public void FixedTests03() {
        String actual = PigLatin.pigIt("tora o mores ![]");
        String expected = "oratay oay oresmay ![]";
        assertEquals(expected, actual );
    }
}
