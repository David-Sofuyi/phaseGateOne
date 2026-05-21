import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestTest{
@Test
    public void testThatFunctionTestForTheSmallestNumberInAnArray(){
        int [] numbers = {14,9,6,5,8,10};
        int expected = 5;
        int actual = Largest.getSmallest(numbers);
        assertEquals(expected, actual);
    }
@Test
    public void testThatFunctionTestForTheLargestNumberInAnArray(){
        int [] numbers = {14,9,6,5,8,10};
        int expected = 15;
        int actual = Largest.getLargest(numbers);
        assertEquals(expected, actual);
    }
}
