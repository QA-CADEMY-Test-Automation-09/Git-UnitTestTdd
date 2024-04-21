package sessions.anghelaAnzaldo.katas.example13;

import java.util.Arrays;


public class Kata13 {
  public static int sortDesc(final int num) {
    String res = Integer.toString(num);
    char[] digits = res.toCharArray();
    Arrays.sort(digits);
    StringBuilder resultSort = new StringBuilder(new String(digits));
    resultSort.reverse();
    return Integer.parseInt(resultSort.toString());
  }
}
