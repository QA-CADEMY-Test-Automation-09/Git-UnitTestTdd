package sessions.giovannaOsinaga.katas.example11;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] numbers) {
        int smallest = numbers[0];
        for (int array: numbers){
           if (array < smallest){
               smallest = array;
           }
        }
        return smallest;
    }
}
