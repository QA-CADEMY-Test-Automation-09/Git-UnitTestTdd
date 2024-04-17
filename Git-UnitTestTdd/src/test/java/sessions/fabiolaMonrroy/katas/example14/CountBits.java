package test.java.sessions.fabiolaMonrroy.katas.example14;

public class CountBits {
    public static int countBits(int num) {
        int count = 0;

        // Loop until the number becomes zero
        while (num != 0) {
            // Use bitwise AND operation with 1 to check the rightmost bit
            // If it's 1, increment the count
            count += num & 1;

            // Right shift the number by 1 to check the next bit
            num >>= 1;
        }
        return count;
    }
}