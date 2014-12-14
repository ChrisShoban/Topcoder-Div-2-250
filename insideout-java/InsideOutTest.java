import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsideOutTest {

    protected InsideOut solution;

    @Before
    public void setUp() {
        solution = new InsideOut();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String line = "I ENIL SIHTHSIREBBIG S";

        String expected = "THIS LINE IS GIBBERISH";
        String actual = solution.unscramble(line);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String line = "LEVELKAYAK";

        String expected = "LEVELKAYAK";
        String actual = solution.unscramble(line);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String line = "H YPPAHSYADILO";

        String expected = "HAPPY HOLIDAYS";
        String actual = solution.unscramble(line);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String line = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String expected = "MLKJIHGFEDCBAZYXWVUTSRQPON";
        String actual = solution.unscramble(line);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String line = "RUT OWT SNEH HCNERF EERHTEGDIRTRAP A DNA  SEVODELT";

        String expected = "THREE FRENCH HENS TWO TURTLEDOVES  AND A PARTRIDGE";
        String actual = solution.unscramble(line);

        Assert.assertEquals(expected, actual);
    }

}
