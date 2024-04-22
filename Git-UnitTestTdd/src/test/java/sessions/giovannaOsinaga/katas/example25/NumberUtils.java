package sessions.giovannaOsinaga.katas.example25;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
       String numberAsString = Integer.toString(number);
       int countDigits = numberAsString.length();
       int sum = 0;
       int newnumber = number;

       while (newnumber > 0){
           int digit = newnumber % 10;
           sum += Math.pow(digit,countDigits);
           newnumber = newnumber /10;
       }
        return number == sum;
    }
}
