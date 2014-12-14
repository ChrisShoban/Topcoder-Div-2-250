import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LetterStringsTest {

    protected LetterStrings solution;

    @Before
    public void setUp() {
        solution = new LetterStrings();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] s = new String[]{"-"};

        int expected = 0;
        int actual = solution.sum(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] s = new String[]{"A"};

        int expected = 1;
        int actual = solution.sum(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] s = new String[]{"-----Abc"};

        int expected = 3;
        int actual = solution.sum(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] s = new String[]{"-A-B-C-D", "--------EFGHI", "JKLMNOPQR", "---STU-VW-XYZ"};

        int expected = 26;
        int actual = solution.sum(s);

        Assert.assertEquals(expected, actual);
    }

}
