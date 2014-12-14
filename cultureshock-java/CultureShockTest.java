import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CultureShockTest {

    protected CultureShock solution;

    @Before
    public void setUp() {
        solution = new CultureShock();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String text = "THE TWENTY SIXTH LETTER OF THE ALPHABET IS ZEE";

        String expected = "THE TWENTY SIXTH LETTER OF THE ALPHABET IS ZED";
        String actual = solution.translate(text);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String text = "ZEE";

        String expected = "ZED";
        String actual = solution.translate(text);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String text = "SPELLING IN ENGLISH IS EZEE";

        String expected = "SPELLING IN ENGLISH IS EZEE";
        String actual = solution.translate(text);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String text = "ZEE ZEE ZED ZEDS ZEE ZEES";

        String expected = "ZED ZED ZED ZEDS ZED ZEES";
        String actual = solution.translate(text);

        Assert.assertEquals(expected, actual);
    }

}
