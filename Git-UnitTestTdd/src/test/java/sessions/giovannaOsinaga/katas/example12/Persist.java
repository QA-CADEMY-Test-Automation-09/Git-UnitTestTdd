package sessions.giovannaOsinaga.katas.example12;

public class Persist {
    public static int persistence(long number) {

        int count = 0;
        int result = 1;

        while (number >= 10){
            String numberAsString = String.valueOf(number);
            char[] digitos = numberAsString.toCharArray();
            for (int i = 0; i < digitos.length; i++) {
                result = result * Character.getNumericValue(digitos[i]);
            }
            count++;
            number = result;
            result = 1;
        }

        return count;
    }
}
