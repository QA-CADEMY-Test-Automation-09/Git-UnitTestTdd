package test.java.sessions.fabiolaMonrroy.katas.example11;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] array) {
        int smallest = array[0]; // Assume the first element is the smallest
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}
