import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaceBookLikeSystemAppTest {

    @Test
    public void testThatNoOneLikesThis() {
        String[] names = {};
        String expected = "no one likes this";
        String actual = FaceBookLikeSystem.getLikes(names);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatPeterLikesThis() {
        String[] names = {"Peter"};
        String expected = "Peter likes this";
        String actual = FaceBookLikeSystem.getLikes(names);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatJacobAndAlexLikesThis() {
        String[] names = {"Jacob", "Alex"};
        String expected = "Jacob and Alex like this";
        String actual = FaceBookLikeSystem.getLikes(names);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatThreePeopleLikesThis() {
        String[] names = {"Max", "John", "Mark"};
        String expected = "Max, John and Mark like this";
        String actual = FaceBookLikeSystem.getLikes(names);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatAlexJacobAndTwoOthersLikesThis() {
        String[] names = {"Alex", "Jacob", "Mark", "Max"};
        String expected = "Alex, Jacob and 2 others like this";
        String actual = FaceBookLikeSystem.getLikes(names);

        assertEquals(expected, actual);
    }
}
