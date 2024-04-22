package sessions.giovannaOsinaga.katas.example20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void test03() {
        String input = "The_Stealth-Warrior";
        System.out.println("input: "+ input);
        assertEquals("TheStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void test04() {
        String input = "Yellow-Wall-right-Blue-bridge";
        System.out.println("input: "+ input);
        assertEquals("YellowWallRightBlueBridge", Solution.toCamelCase(input));
    }

}
