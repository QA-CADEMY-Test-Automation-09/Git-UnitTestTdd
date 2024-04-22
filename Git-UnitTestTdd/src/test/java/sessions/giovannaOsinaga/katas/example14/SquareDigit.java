package sessions.giovannaOsinaga.katas.example14;

public class SquareDigit {
    public int squareDigits(int number) {
        String concatNumber = "";
        String numberofString = String.valueOf(number);
        char[] digits = numberofString.toCharArray();

        for (char digit: digits){
            concatNumber= concatNumber + Character.getNumericValue(digit) * Character.getNumericValue(digit);
        }

        return Integer.parseInt(concatNumber);
    }
}
