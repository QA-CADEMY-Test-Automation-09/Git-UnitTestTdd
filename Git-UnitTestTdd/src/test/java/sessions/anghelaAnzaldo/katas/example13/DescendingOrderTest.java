package sessions.anghelaAnzaldo.katas.example13;

import org.junit.jupiter.api.Test;

import java.net.Authenticator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingOrderTest {

    @Test
    public void test_01() {

        //Given
        int num = 0;
        //When
        int result = Kata13.sortDesc(num);
        //Then
        assertEquals(0, result);
    }


    @Test
    public void test_02() {

        //Given
        int num = 15;
        //When
        int result = Kata13.sortDesc(num);
        //Then

        assertEquals(51, result);
    }


    @Test
    public void test_03() {
        //Given
        int num = 123456789;
        //When
        int result = Kata13.sortDesc(num);
        //Then

        assertEquals(987654321, result);
    }
}
