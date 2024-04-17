package test.java.sessions.fabiolaMonrroy.katas.example18;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberPrimeTest {
    @Test
    public void testBasic() {
        assertFalse("0  is not prime", NumberPrime.isPrime(0));
        assertFalse("1  is not prime", NumberPrime.isPrime(1));
        assertTrue ("2  is prime",     NumberPrime.isPrime(2));
        assertTrue ("73 is prime",     NumberPrime.isPrime(73));
        assertFalse("75 is not prime", NumberPrime.isPrime(75));
        assertFalse("-1 is not prime", NumberPrime.isPrime(-1));
    }

    @Test
    public void testPrime() {
        assertTrue("3 is prime", NumberPrime.isPrime(3));
        assertTrue("5 is prime", NumberPrime.isPrime(5));
        assertTrue("7 is prime", NumberPrime.isPrime(7));
        assertTrue("41 is prime", NumberPrime.isPrime(41));
        assertTrue("5099 is prime", NumberPrime.isPrime(5099));
    }

    @Test
    public void testNotPrime() {
        assertFalse("4 is not prime", NumberPrime.isPrime(4));
        assertFalse("6 is not prime", NumberPrime.isPrime(6));
        assertFalse("8 is not prime", NumberPrime.isPrime(8));
        assertFalse("9 is not prime", NumberPrime.isPrime(9));
        assertFalse("45 is not prime", NumberPrime.isPrime(45));
        assertFalse("-5 is not prime", NumberPrime.isPrime(-5));
        assertFalse("-8 is not prime", NumberPrime.isPrime(-8));
        assertFalse("-41 is not prime", NumberPrime.isPrime(-41));
    }
}
