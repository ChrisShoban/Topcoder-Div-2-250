import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InequalityCheckerTest {

    protected InequalityChecker solution;

    @Before
    public void setUp() {
        solution = new InequalityChecker();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int n = 2;

        int[] expected = new int[]{1, 1};
        int[] actual = solution.getDifferences(n);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int n = 3;

        int[] expected = new int[]{9, 4};
        int[] actual = solution.getDifferences(n);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int n = 100;

        int[] expected = new int[]{2500, 1};
        int[] actual = solution.getDifferences(n);

        Assert.assertArrayEquals(expected, actual);
    }

}
