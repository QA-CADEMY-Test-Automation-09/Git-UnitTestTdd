package test.java.sessions.fabiolaMonrroy.katas.example3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class HighAndLow {
    public static String highLow(String number) {

        List<Integer> numbersInt = new ArrayList<>();

        String[] num = number.split(" ");
        for (int i = 0; i < num.length; i++) {
            numbersInt.add(Integer.parseInt(num[i]));
        }
        Collections.sort(numbersInt);
        int numberLow = numbersInt.get(0);
        int numberHigh = numbersInt.get(numbersInt.size()-1);
        return numberHigh + " " + numberLow;

    }
}