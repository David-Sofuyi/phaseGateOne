import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumTwoArrayTest {
    
    @Test
    public void testFindPairThatSumsTo12() {
        int[] numbers = {1, 2, 5, 7, 6, 8, 9};
        int target = 12;
        int[] expected = {5, 7};
        assertArrayEquals(expected, SumTwoArray.findPairThatSumsTo(numbers, target));
    }
    // @Test
    // public void testFindPairThatSumsTo6() {
    //     int[] numbers = {8,6,12,4,-2};
    //     int target = 6;
    //     int[] expected = {8, -2};
    //     assertArrayEquals(expected, SumTwoArray.findPairThatSumsTo(numbers, target));
    // }
}

