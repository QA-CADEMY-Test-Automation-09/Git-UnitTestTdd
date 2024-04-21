package sessions.anghelaAnzaldo.katas.example16;

public class Kata16 {
    public static int digital_root(int n) {
       while(n>=10){
           int sum=0;
           while (n>0){
               sum= sum+(n%10);
               n/=10;
           }
           n=sum;
       }
       return n;
    }
}
