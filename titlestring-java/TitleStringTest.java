import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TitleStringTest {

    protected TitleString solution;

    @Before
    public void setUp() {
        solution = new TitleString();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String title = "introduction to algorithms";

        String expected = "Introduction To Algorithms";
        String actual = solution.toFirstUpperCase(title);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String title = "more than  one   space    between     words";

        String expected = "More Than  One   Space    Between     Words";
        String actual = solution.toFirstUpperCase(title);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String title = "  lord of the rings   the fellowship of the ring  ";

        String expected = "  Lord Of The Rings   The Fellowship Of The Ring  ";
        String actual = solution.toFirstUpperCase(title);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String title = "  ";

        String expected = "  ";
        String actual = solution.toFirstUpperCase(title);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String title = "i";

        String expected = "I";
        String actual = solution.toFirstUpperCase(title);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String title = "the king and i";

        String expected = "The King And I";
        String actual = solution.toFirstUpperCase(title);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String title = "";

        String expected = "";
        String actual = solution.toFirstUpperCase(title);

        Assert.assertEquals(expected, actual);
    }

}
