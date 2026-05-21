import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuplicateTest{
@Test
    public void testThatFunctionTestDuplicatesNumbersInAnArray(){
        int [] numbers = [9,5,1,9,4,5,1,7];
        int expected = [9,5,1,4,7]
        int actual = Duplicate.getDuplicate(numbers);
        assertEquals(expected, actual);
    }  
}
