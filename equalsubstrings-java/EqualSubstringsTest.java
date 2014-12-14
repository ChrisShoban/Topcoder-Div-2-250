import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EqualSubstringsTest {

    protected EqualSubstrings solution;

    @Before
    public void setUp() {
        solution = new EqualSubstrings();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String str = "aaabbb";

        String[] expected = new String[]{"aaa", "bbb"};
        String[] actual = solution.getSubstrings(str);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String str = "bbbaaa";

        String[] expected = new String[]{"bbb", "aaa"};
        String[] actual = solution.getSubstrings(str);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String str = "bbbbbb";

        String[] expected = new String[]{"bbbbbb", ""};
        String[] actual = solution.getSubstrings(str);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String str = "aaaaaa";

        String[] expected = new String[]{"", "aaaaaa"};
        String[] actual = solution.getSubstrings(str);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String str = "abjlkbjalkbjaljsbljbalb";

        String[] expected = new String[]{"abjlkbjalkbjaljs", "bljbalb"};
        String[] actual = solution.getSubstrings(str);

        Assert.assertArrayEquals(expected, actual);
    }

}
