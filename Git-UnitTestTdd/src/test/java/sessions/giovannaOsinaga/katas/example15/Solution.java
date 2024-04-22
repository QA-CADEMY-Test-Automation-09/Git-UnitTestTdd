package sessions.giovannaOsinaga.katas.example15;

public class Solution {
    public static String whoLikesIt(String... names) {
        String textLike = "";

        if (names.length != 0){
            for (int i = 0; i < names.length; i++) {
                if (names.length == 1){
                    textLike = names[i] + " likes this";
                } else if (names.length == 2) {
                    textLike = String.join(" and ", names[0], names[1]  + " like this");
                } else if (names.length == 3) {
                    textLike = String.join(", ", names[0], names[1] + " and " + names[2] + " like this");
                } else {
                    textLike = String.join(", ", names[0], names[1] + " and " + (names.length-2) + " others like this");
                }
            }
        }else {
            textLike = "no one likes this";
        }
        return textLike;
    }
}
