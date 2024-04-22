package sessions.giovannaOsinaga.katas.example18;

public class Kata {
    public static int makeNegative(final int number) {
        int negativeNumber = 0;
        if(number == 0){
            negativeNumber = 0;
        } else if (number > 0) {
            negativeNumber = number * (-1);
        }else {
            negativeNumber = number;
        }
        return negativeNumber;

    }
}
