package sessions.giovannaOsinaga.katas.example24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpinWordsTest {
    @Test
    public void test1() {
        String actual = new SpinWords().spinWords("Welcome");
        String expect = "emocleW";
        assertEquals(expect, actual);

    }
    @Test
    public void test2() {
        String actual = new SpinWords().spinWords("Hey fellow warriors");
        String expect = "Hey wollef sroirraw";
        assertEquals(expect, actual);
    }
    @Test
    public void test3() {
        String actual = new SpinWords().spinWords("This is a test");
        String expect = "This is a test";
        assertEquals(expect, actual);
    }
    @Test
    public void test4() {
        String actual = new SpinWords().spinWords("This is another test");
        String expect = "This is rehtona test";
        assertEquals(expect, actual);
    }
}
