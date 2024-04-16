package sessions.giovannaOsinaga.katas.example9;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests(){
        String sentence = "codewars";
        String actualResult = Solution.solve(sentence);
        assertEquals("srawedoc",actualResult);

    }
    @Test
    public void basicTests02(){
        String sentence = "your code";
        String actualResult = Solution.solve(sentence);
        assertEquals("edoc ruoy",actualResult);

    }
    @Test
    public void basicTests03(){
        String sentence = "your code rocks";
        String actualResult = Solution.solve(sentence);
        assertEquals("skco redo cruoy",actualResult);
    }
}
