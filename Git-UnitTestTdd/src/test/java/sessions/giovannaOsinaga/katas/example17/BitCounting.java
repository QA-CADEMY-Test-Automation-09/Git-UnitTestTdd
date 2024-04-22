package sessions.giovannaOsinaga.katas.example17;

public class BitCounting {
    public static int countBits(int number){
        int count = 0;
        String binaryNumber = Long.toBinaryString(number);
        char[] digits = binaryNumber.toCharArray();
        for (char digit: digits){
            if (Character.getNumericValue(digit) == 1){
                count++;
            }
        }
        return count;
    }
}
