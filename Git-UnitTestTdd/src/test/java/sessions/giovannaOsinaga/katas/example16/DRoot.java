package sessions.giovannaOsinaga.katas.example16;

public class DRoot {
    public static int digital_root(int number) {
        int result = 0;
        while (number >= 10){
            String numberAsString = String.valueOf(number);
            char[] digits = numberAsString.toCharArray();
            for (int i = 0; i < digits.length; i++) {
                result = result + Character.getNumericValue(digits[i]);
            }
            number = result;
            result = 0;
        }
        return number;
    }
}
