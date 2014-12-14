import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WaiterTippingTest {

    protected WaiterTipping solution;

    @Before
    public void setUp() {
        solution = new WaiterTipping();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int total = 500;
        int taxPercent = 10;
        int money = 600;

        int expected = 10;
        int actual = solution.maxPercent(total, taxPercent, money);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int total = 500;
        int taxPercent = 10;
        int money = 604;

        int expected = 10;
        int actual = solution.maxPercent(total, taxPercent, money);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int total = 850;
        int taxPercent = 8;
        int money = 870;

        int expected = -1;
        int actual = solution.maxPercent(total, taxPercent, money);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int total = 226;
        int taxPercent = 48;
        int money = 584;

        int expected = 111;
        int actual = solution.maxPercent(total, taxPercent, money);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int total = 123;
        int taxPercent = 52;
        int money = 696;

        int expected = 415;
        int actual = solution.maxPercent(total, taxPercent, money);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int total = 500;
        int taxPercent = 10;
        int money = 550;

        int expected = 0;
        int actual = solution.maxPercent(total, taxPercent, money);

        Assert.assertEquals(expected, actual);
    }

}
