package test.java.sessions.fabiolaMonrroy.katas.example5;

public class Solution {
    public int solution(int number) {
        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
