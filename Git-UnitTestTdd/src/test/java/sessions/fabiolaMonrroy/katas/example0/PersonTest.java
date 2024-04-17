package test.java.sessions.fabiolaMonrroy.katas.example0;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void validTests() {
        Person person = new Person("Fabiola", "Monrroy Vera", 6789752,34);
        assertEquals("Fabiola Monrroy Vera", person.getFullName());

    }
    @Test
    public void testsNameCapitalized() {
        Person person = new Person("fabiola", "monrroy vera", 6789752,34);
        assertEquals("Fabiola Monrroy Vera", person.getFullName());

    }

    @Test
    public void validTestMultipleName() {
        Person person = new Person("fabiola maria", "monrroy vera gumucio", 6789752,34);
        assertEquals("Fabiola Maria Monrroy Vera Gumucio", person.getFullName());

    }
}