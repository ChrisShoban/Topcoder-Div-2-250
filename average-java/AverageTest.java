import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AverageTest {

    protected Average solution;

    @Before
    public void setUp() {
        solution = new Average();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] math = new int[]{200, 250, 700, 700};
        int[] verbal = new int[]{400, 400, 400, 400};

        int expected = 2;
        int actual = solution.belowAvg(math, verbal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] math = new int[]{500, 400};
        int[] verbal = new int[]{300, 400};

        int expected = 0;
        int actual = solution.belowAvg(math, verbal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] math = new int[]{293};
        int[] verbal = new int[]{799};

        int expected = 0;
        int actual = solution.belowAvg(math, verbal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] math = new int[]{400, 400, 400, 400, 400, 400, 401};
        int[] verbal = new int[]{400, 400, 400, 400, 400, 400, 400};

        int expected = 6;
        int actual = solution.belowAvg(math, verbal);

        Assert.assertEquals(expected, actual);
    }

}
