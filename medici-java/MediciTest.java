import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MediciTest {

    protected Medici solution;

    @Before
    public void setUp() {
        solution = new Medici();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] fame = new int[]{20, 30, 50};
        int[] fortune = new int[]{60, 80, 40};
        int[] secrets = new int[]{40, 30, 50};

        int expected = 2;
        int actual = solution.winner(fame, fortune, secrets);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] fame = new int[]{0, 100, 100, 100};
        int[] fortune = new int[]{100, 0, 100, 50};
        int[] secrets = new int[]{50, 50, 50, 100};

        int expected = -1;
        int actual = solution.winner(fame, fortune, secrets);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] fame = new int[]{1, 0};
        int[] fortune = new int[]{1, 99};
        int[] secrets = new int[]{1, 99};

        int expected = 0;
        int actual = solution.winner(fame, fortune, secrets);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] fame = new int[]{39, 42, 57};
        int[] fortune = new int[]{42, 39, 57};
        int[] secrets = new int[]{57, 39, 42};

        int expected = 2;
        int actual = solution.winner(fame, fortune, secrets);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] fame = new int[]{3, 98, 0, 71, 81, 85, 99, 58, 93, 79, 100, 98, 73, 83, 52, 100, 37, 93, 39, 27};
        int[] fortune = new int[]{96, 34, 45, 20, 72, 71, 7, 18, 47, 35, 54, 51, 52, 21, 49, 20, 44, 72, 90, 93};
        int[] secrets = new int[]{15, 72, 50, 84, 41, 49, 35, 71, 20, 29, 73, 18, 35, 61, 70, 34, 59, 68, 90, 18};

        int expected = 17;
        int actual = solution.winner(fame, fortune, secrets);

        Assert.assertEquals(expected, actual);
    }

}
