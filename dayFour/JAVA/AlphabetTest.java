import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlphabetTest{
@Test
    public void testThatFunctionTestForVowelsInAnArray(){
        String [] alphabets = {"pie", "fly", Rat};
        String expected = {"pie", "Rat"};
        String actual = Alphabet.getVowels(alphabets);
        assertEquals(expected, actual);
    }
@Test
    public void testThatFunctionTestForConsonantsInAnArray(){
        String [] alphabets = {"pie", "fly", "Rat"};
        String expected = {"fly"};
        String actual = Alphabet.getConsonants(alphabets);
        assertEquals(expected, actual);
    }  
}
