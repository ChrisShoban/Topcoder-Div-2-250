import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VLNStringTest {

    protected VLNString solution;

    @Before
    public void setUp() {
        solution = new VLNString();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String longName = "dance dance revolution";

        String expected = "DDR";
        String actual = solution.makeAcronym(longName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String longName = "  return  of  the king   ";

        String expected = "RK";
        String actual = solution.makeAcronym(longName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String longName = "the united states of america";

        String expected = "USA";
        String actual = solution.makeAcronym(longName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String longName = " of  the   and    ";

        String expected = "";
        String actual = solution.makeAcronym(longName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String longName = " ";

        String expected = "";
        String actual = solution.makeAcronym(longName);

        Assert.assertEquals(expected, actual);
    }

}
