package sessions.willyAranibar.katas.example5;

import java.util.stream.IntStream;

public class Kata {
    public static int sumMultiples(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int sumMultiplesUsingIntStream(int number) {
        return IntStream.range(0, number)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }

}
