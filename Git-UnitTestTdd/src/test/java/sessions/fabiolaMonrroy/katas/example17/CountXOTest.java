package test.java.sessions.fabiolaMonrroy.katas.example17;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountXOTest {
    @ParameterizedTest(name = "str = \"{1}\"") @DisplayName("Sample tests")
    @CsvSource(textBlock = """
      true,  ooxx
      false, xooxx
      true,  ooxXm
      true,  zpzpzpp
      false, zzoo
      true,  xxxooo
      true,  xxxXooOo
      false, xxx23424esdsfvxXXOOooo
      false, xXxxoewrcoOoo
      false, XxxxooO
      true,  zssddd
      false, Xxxxertr34
      true,  '' 
  """)
    void sampleTests(boolean expected, String input) {
        assertEquals(expected, CountXO.getXO(input));
    }
}
