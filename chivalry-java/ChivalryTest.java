import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChivalryTest {

    protected Chivalry solution;

    @Before
    public void setUp() {
        solution = new Chivalry();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String first = "M";
        String second = "W";

        String expected = "WM";
        String actual = solution.getOrder(first, second);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String first = "MM";
        String second = "MW";

        String expected = "MMMW";
        String actual = solution.getOrder(first, second);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String first = "MMMM";
        String second = "W";

        String expected = "WMMMM";
        String actual = solution.getOrder(first, second);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String first = "M";
        String second = "WWW";

        String expected = "WWWM";
        String actual = solution.getOrder(first, second);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase4() {
        String first = "WWWMMMWWWWWWWWWMWWWWWWWWWW";
        String second = "WMMMWMWMWMWMMMMMWWMWWMWMW";

        String expected = "WWWWMMMWWWWWWWWWMWWWWWWWWWWMMMWMWMWMWMMMMMWWMWWMWMW";
        String actual = solution.getOrder(first, second);

        Assert.assertEquals(expected, actual);
    }
}
