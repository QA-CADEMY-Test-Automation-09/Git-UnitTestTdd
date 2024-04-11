package sessions.rodrigoAyala.katas.example1;

public class Kata {
    public static String createPhoneNumberV1(int[] numbers) {
        String numberWithFormat = "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        return numberWithFormat;
    }

    public static String createPhoneNumberV2(int[] numbers) {
        String numberWithStringFormat = String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
        return numberWithStringFormat;
    }

    public static String createPhoneNumberV3(int[] numbers) {
        String result = "(";
        for (int i = 0; i < numbers.length; i++) {
            result += (i == 3) ? ") " : "";
            result += (i == 6) ? "-" : "";
            result += numbers[i];
        }
        return result;
    }
}