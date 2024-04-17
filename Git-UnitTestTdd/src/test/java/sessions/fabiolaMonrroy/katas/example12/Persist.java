package test.java.sessions.fabiolaMonrroy.katas.example12;

public class Persist {
    public static int persistence(long num) {
        int count = 0;
        while (num >= 10) {
            long product = 1;
            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }
            num = product;
            count++;
        }
        return count;
    }
}
