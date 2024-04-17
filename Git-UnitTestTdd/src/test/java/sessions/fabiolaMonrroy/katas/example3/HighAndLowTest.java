package test.java.sessions.fabiolaMonrroy.katas.example3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class HighAndLowTest {
    @org.junit.Test
    public void test1() {
        Assert.assertEquals("42 -9", HighAndLow.highLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    @Test
    public void test2() {
        Assert.assertEquals("3 1", HighAndLow.highLow("1 2 3"));
    }

}