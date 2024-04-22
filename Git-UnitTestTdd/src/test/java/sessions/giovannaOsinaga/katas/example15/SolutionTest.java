package sessions.giovannaOsinaga.katas.example15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 public class SolutionTest {
    @Test
    public void staticTests01() {
        String expected = "no one likes this";
        String actual = Solution.whoLikesIt();
        assertEquals(expected, actual);
    }
     @Test
     public void staticTests02() {
         String expected = "Peter likes this";
         String actual = Solution.whoLikesIt("Peter");
         assertEquals(expected, actual);
     }
     @Test
     public void staticTests03() {
         String expected = "Jacob and Alex like this";
         String actual = Solution.whoLikesIt("Jacob", "Alex");
         assertEquals(expected, actual);
     }
     @Test
     public void staticTests04() {
         String expected = "Max, John and Mark like this";
         String actual = Solution.whoLikesIt("Max", "John", "Mark");
         assertEquals(expected, actual);
     }
     @Test
     public void staticTests05() {
         String expected = "Alex, Jacob and 2 others like this";
         String actual = Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max");
         assertEquals(expected, actual);
     }
}
