package sessions.giovannaOsinaga.katas.example10;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void findShort() {
        String sentence = "bitcoin take over the world maybe who knows perhaps";
        int actualResult = Kata.findShort(sentence);

        assertEquals(3, actualResult);

    }
    @Test
    public void findShort2() {
        String sentence = "turns out random test cases are easier than writing out basic ones";
        int actualResult = Kata.findShort(sentence);

        assertEquals(3, actualResult);

    }
    @Test
    public void findShort3() {
        String sentence = "Let's travel abroad shall we";
        int actualResult = Kata.findShort(sentence);

        assertEquals(2, actualResult);
    }
}
