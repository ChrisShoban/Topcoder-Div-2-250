import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCompareTest {

    protected StringCompare solution;

    @Before
    public void setUp() {
        solution = new StringCompare();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String a = "TICK";
        String b = "TOCK";

        int expected = 3;
        int actual = solution.simpleDifference(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String a = "CAT";
        String b = "DOG";

        int expected = 0;
        int actual = solution.simpleDifference(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String a = "APPLE";
        String b = "APPLES";

        int expected = 5;
        int actual = solution.simpleDifference(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String a = "FANTASTIC";
        String b = "ANTASTIC";

        int expected = 0;
        int actual = solution.simpleDifference(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String a = "ANTIDISESTABLISHMENTARIANISM";
        String b = "FLOCCIPAUCINIHILIPIFICATION";

        int expected = 1;
        int actual = solution.simpleDifference(a, b);

        Assert.assertEquals(expected, actual);
    }

}
