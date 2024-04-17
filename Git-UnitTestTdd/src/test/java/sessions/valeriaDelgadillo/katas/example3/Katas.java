package sessions.valeriaDelgadillo.katas.example3;
import java.util.Arrays;

public class Katas {
    public static String highAndLow(String numbers) {
        String[] numsString = numbers.split(" ");

        // Convertir los números de cadena a números enteros
        int[] nums = Arrays.stream(numsString).mapToInt(Integer::parseInt).toArray();

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        // Convertir los máximos y mínimos a cadenas
        String maxString = Integer.toString(max);
        String minString = Integer.toString(min);

        return maxString + " " + minString;
    }
}
