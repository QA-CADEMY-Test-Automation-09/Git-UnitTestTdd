package sessions.victorCarrasco.katas.example3;


public class Kata {

    public static String highAndLow(String numbers) {
        // Split the input string into individual numbers
        String[] nums = numbers.split(" ");

        // Initialize variables to hold the highest and lowest numbers
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Iterate through the numbers to find the highest and lowest
        for (String num : nums) {
            int n = Integer.parseInt(num);
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        // Return the highest and lowest numbers as a formatted string
        return max + " " + min;
    }

}
