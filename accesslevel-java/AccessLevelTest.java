import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccessLevelTest {

    protected AccessLevel solution;

    @Before
    public void setUp() {
        solution = new AccessLevel();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] rights = new int[]{0, 1, 2, 3, 4, 5};
        int minPermission = 2;

        String expected = "DDAAAA";
        String actual = solution.canAccess(rights, minPermission);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] rights = new int[]{5, 3, 2, 10, 0};
        int minPermission = 20;

        String expected = "DDDDD";
        String actual = solution.canAccess(rights, minPermission);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] rights = new int[]{};
        int minPermission = 20;

        String expected = "";
        String actual = solution.canAccess(rights, minPermission);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] rights = new int[]{34, 78, 9, 52, 11, 1};
        int minPermission = 49;

        String expected = "DADADD";
        String actual = solution.canAccess(rights, minPermission);

        Assert.assertEquals(expected, actual);
    }

}
