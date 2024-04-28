package sessions.rodrigoAyala.katas.example5;

public class Kata {
    public int solution(int number) {
        //TODO: Code stuff here
        int suma=0;
        for (int i = 0; i < number; i++) {
            if ( (i % 3) == 0 || i % 5 == 0) {
                suma=suma+i;
            }


        }
        return suma;
    }
}
