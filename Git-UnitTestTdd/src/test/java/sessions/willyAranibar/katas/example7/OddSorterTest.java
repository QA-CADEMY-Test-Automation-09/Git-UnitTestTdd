package sessions.willyAranibar.katas.example7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddSorterTest {

    @Test
    public void testSortArrayGivenExample() {
        // Given
        int[] array = {5, 3, 2, 8, 1, 4};

        // When
        int[] result = Kata.sortArray(array);

        // Then
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, result);
    }

    @Test
    public void testSortArrayEmptyArray() {
        // Given
        int[] array = {};

        // When
        int[] result = Kata.sortArray(array);

        // Then
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testSortArrayAllEven() {
        // Given
        int[] array = {2, 4, 6, 8};

        // When
        int[] result = Kata.sortArray(array);

        // Then
        assertArrayEquals(new int[]{2, 4, 6, 8}, result);
    }

    @Test
    public void testSortArrayAllOdd() {
        // Given
        int[] array = {7, 5, 3, 1};

        // When
        int[] result = Kata.sortArray(array);

        // Then
        assertArrayEquals(new int[]{1, 3, 5, 7}, result);
    }
}
