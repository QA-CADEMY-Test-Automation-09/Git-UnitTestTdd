package sessions.giovannaOsinaga.katas.example13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsTest {
    String message = "Nope!";
    @Test
    public void testCase1() {
        String sentence = "abracadabra";
        int actual = Vowels.getCount(sentence);
        assertEquals(5, actual,message);
    }
    @Test
    public void testCase2() {
        String sentence = "";
        int actual = Vowels.getCount(sentence);
        assertEquals(0, actual,message);
    }
    @Test
    public void testCase3() {
        String sentence = "pear tree";
        int actual = Vowels.getCount(sentence);
        assertEquals(4, actual,message);
    }
    @Test
    public void testCase4() {
        String sentence = "o a kak ushakov lil vo kashu kakao";
        int actual = Vowels.getCount(sentence);
        assertEquals(13, actual,message);
    }
    @Test
    public void testCase5() {
        String sentence = "tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty";
        int actual = Vowels.getCount(sentence);
        assertEquals(168, actual,message);
    }
}