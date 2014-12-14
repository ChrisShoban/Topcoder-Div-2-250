import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplesTest {

    protected Multiples solution;

    @Before
    public void setUp() {
        solution = new Multiples();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int min = 0;
        int max = 14;
        int factor = 5;

        int expected = 3;
        int actual = solution.number(min, max, factor);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int min = 7;
        int max = 24;
        int factor = 3;

        int expected = 6;
        int actual = solution.number(min, max, factor);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int min = -123456;
        int max = 654321;
        int factor = 997;

        int expected = 780;
        int actual = solution.number(min, max, factor);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int min = -75312;
        int max = 407891;
        int factor = 14;

        int expected = 34515;
        int actual = solution.number(min, max, factor);

        Assert.assertEquals(expected, actual);
    }

}
