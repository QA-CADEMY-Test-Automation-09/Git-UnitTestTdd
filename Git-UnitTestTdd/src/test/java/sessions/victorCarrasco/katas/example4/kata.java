package sessions.victorCarrasco.katas.example4;

import java.util.ArrayList;
import java.util.List;

public class kata {
    public static String camelCase(String palabras  ) {

        // Dividir la cadena en palabras individuales
        String[] palabrasArray = palabras.split(" ");

// Crear una lista para almacenar las palabras con las primeras letras en mayúscula
        List<String> palabrasCapitalizadas = new ArrayList<>();

// Iterar sobre cada palabra y capitalizar las primeras letras
        for (String palabra : palabrasArray) {
            palabrasCapitalizadas.add(palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase());
        }

// Unir las palabras capitalizadas en una sola cadena separadas por un espacio
        String primerasLetrasMayus = String.join(" ", palabrasCapitalizadas);

        //2
        String seppalabras  = primerasLetrasMayus.concat("");

        return primerasLetrasMayus + seppalabras;





    }
}
