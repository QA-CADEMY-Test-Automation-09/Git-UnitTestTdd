package sessions.anghelaAnzaldo.katas.example3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighLow {

    @Test
    public void test1() {
        assertEquals("42 -9", kata3.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    @Test
    public void test2() {
        assertEquals("3 1", kata3.highAndLow("1 2 3"));
    }
}
