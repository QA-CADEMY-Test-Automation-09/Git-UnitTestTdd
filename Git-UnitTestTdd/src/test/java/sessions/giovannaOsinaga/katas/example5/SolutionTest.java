package sessions.giovannaOsinaga.katas.example5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test01() {
        int number = 10;
        int multiploSum= Solution.solution(number);
        assertEquals(23, multiploSum);
    }
    @Test
    public void test02() {
        int number = -10;
        int multiploSum= Solution.solution(number);
        assertEquals(0, multiploSum);

    }
    @Test
    public void test03() {
        int number = 7;
        int multiploSum= Solution.solution(number);
        assertEquals(14, multiploSum);
    }
    @Test
    public void test04() {
        int number = 5;
        int multiploSum= Solution.solution(number);
        assertEquals(3, multiploSum);

    }
}
