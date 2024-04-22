package sessions.giovannaOsinaga.katas.example16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DRootExampleTest {

    @Test
    public void Test1() {
        String message = "Nope!";
        int actual = DRoot.digital_root(16);
        assertEquals(7, actual, message);
    }
    @Test
    public void Test2() {
        String message = "Nope!";
        int actual = DRoot.digital_root(456);
        assertEquals(6, actual, message);
    }
    @Test
    public void Test3() {
        String message = "Nope!";
        int actual = DRoot.digital_root(132189);
        assertEquals(6, actual, message);
    }
}
