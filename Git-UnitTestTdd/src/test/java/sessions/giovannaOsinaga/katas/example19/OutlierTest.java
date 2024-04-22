package sessions.giovannaOsinaga.katas.example19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutlierTest {
    @Test
    void sampleTests01() {
        int[] numbers = new int[]{2, 6, 8, -10, 3};
        int actual = FindOutlier.find(numbers);
        assertEquals(3, actual);
        assertEquals(206847684, FindOutlier.find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        assertEquals(0, FindOutlier.find(new int[] {Integer.MAX_VALUE, 0, 1}));
    }
    @Test
    void sampleTests02() {
        int[] numbers = new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int actual = FindOutlier.find(numbers);
        assertEquals(206847684, actual);

    }
    @Test
    void sampleTests03() {
        int[] numbers = new int[]{Integer.MAX_VALUE, 0, 1};
        int actual = FindOutlier.find(numbers);
        assertEquals(0, actual);
    }
}
