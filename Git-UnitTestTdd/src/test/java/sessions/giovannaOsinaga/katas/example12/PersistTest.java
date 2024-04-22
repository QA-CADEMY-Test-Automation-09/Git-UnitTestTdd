package sessions.giovannaOsinaga.katas.example12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersistTest {
    @Test
    public void basicTests1() {
        String message = "Incorrect answer for n=39";
        int actual = Persist.persistence( 39);
        assertEquals(3, actual,message );

    }
    @Test
    public void basicTests2() {
        String message = "Incorrect answer for n=4" ;
        int actual = Persist.persistence( 4);
        assertEquals(0, actual, message );
    }
    @Test
    public void basicTests3() {
        String message = "Incorrect answer for n=25";
        int actual = Persist.persistence( 25);
        assertEquals(2, actual, message );

    }
    @Test
    public void basicTests4() {
        String message = "Incorrect answer for n=999";
        int actual = Persist.persistence( 999);

        assertEquals(4, actual, message);
    }
    @Test
    public void basicTests5() {
        String message = "Incorrect answer for n=405658";
        int actual = Persist.persistence( 405658);

        assertEquals(1, actual, message);
    }

}
