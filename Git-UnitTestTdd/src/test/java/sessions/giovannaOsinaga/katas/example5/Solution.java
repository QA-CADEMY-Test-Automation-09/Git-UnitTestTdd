package sessions.giovannaOsinaga.katas.example5;

public class Solution {
    public static int solution(int number) {
        int sum = 0;
        if (number > 0){
            for (int i = 1; i < number; i++) {
                if (i % 3 == 0){
                    sum = sum + i;
                } else if (i % 5 == 0) {
                    sum = sum + i;

                }
            }
        }

    return sum;

    }
}
