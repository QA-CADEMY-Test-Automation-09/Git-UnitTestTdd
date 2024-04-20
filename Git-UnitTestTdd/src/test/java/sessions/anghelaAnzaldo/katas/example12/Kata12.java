package sessions.anghelaAnzaldo.katas.example12;

public class Kata12 {
    public static int persistence(int num) {
        // Initialize the persistence count
        int persistenceCount = 0;

        // Continue calculating persistence until num becomes a single digit
        while (num >= 10) {
            // Multiply the digits of num
            int product = 1;
            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }

            // Update num with the product and increment the persistence count
            num = product;
            persistenceCount++;
        }

        return persistenceCount;
    }
}
