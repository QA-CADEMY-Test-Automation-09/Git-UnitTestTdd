package sessions.anghelaAnzaldo.katas.example3;

public class kata3 {
    public static String highAndLow(String numbers)
    {

        String[] numArray = numbers.split(" ");
        int resultHigh=Integer.MIN_VALUE;
        int resultLow=Integer.MAX_VALUE;

        for(String numsI:numArray){
            //System.out.println(numsI);
            int thisNum= Integer.parseInt(numsI);
            if(thisNum>resultHigh){
                resultHigh=thisNum;
            }
            if(thisNum<resultLow){
                resultLow=thisNum;
            }

        }
        return resultHigh +" "+ resultLow;
    }

}
