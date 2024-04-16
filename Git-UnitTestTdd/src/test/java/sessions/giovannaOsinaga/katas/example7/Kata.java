package sessions.giovannaOsinaga.katas.example7;

import java.util.Arrays;


public class Kata {
    public static int[] sortArray(int[] array) {

    int[] arrayOdd = new int[array.length];
    int[] sortArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1){
                arrayOdd[i] = array[i];
            }
        }
        Arrays.sort(arrayOdd);

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1){
               for (int j = 0; j < arrayOdd.length; j++) {
                    if (arrayOdd[j] != 0){
                        sortArray[i] = arrayOdd[j];
                        arrayOdd[j] = 0;
                        break;
                    }
                }

            }
            else {
                sortArray[i] = array[i];
            }
        }
        return sortArray;

    }

}
