package sessions.giovannaOsinaga.katas.example19;

public class FindOutlier {
    static int find(int[] integers) {
        int oddNumber = 0;
        int evenNumber = 0;
        int selectedNumberOdd = 0;
        int selectedNumberEven= 0;

        for (int number: integers){
            if (number % 2 == 0){
                oddNumber++ ;
                selectedNumberOdd = number;
            }
            else {
                evenNumber++;
                selectedNumberEven = number;
            }
        }
        if(oddNumber < evenNumber){
            return selectedNumberOdd;
        }
        else{
            return selectedNumberEven;
        }
    }
}
