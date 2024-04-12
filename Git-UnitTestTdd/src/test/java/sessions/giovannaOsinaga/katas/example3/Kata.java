package sessions.giovannaOsinaga.katas.example3;

public class Kata {
    public static String highAndLow(String numbers) {
        // Code here or
        String[] nums = numbers.split(" ");

        int highest = Integer.parseInt(nums[0]);
        int lowest = Integer.parseInt(nums[0]);
        String highResult = null;

        for (int i = 0; i < nums.length; i++) {
            int numEntero = Integer.parseInt(nums[i]);
            if (numEntero > highest){
                highest = numEntero;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            int numEntero = Integer.parseInt(nums[i]);
            if (numEntero < lowest){
                lowest = numEntero;

            }

        }
        highResult = highest + " " + lowest;

        return highResult;
    }
}
