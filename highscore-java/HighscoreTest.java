import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HighscoreTest {

    protected Highscore solution;

    @Before
    public void setUp() {
        solution = new Highscore();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] scores = new int[]{100, 90, 80};
        int newscore = 90;
        int places = 10;

        int expected = 2;
        int actual = solution.getRank(scores, newscore, places);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] scores = new int[]{};
        int newscore = 0;
        int places = 50;

        int expected = 1;
        int actual = solution.getRank(scores, newscore, places);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] scores = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int newscore = 1;
        int places = 10;

        int expected = -1;
        int actual = solution.getRank(scores, newscore, places);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] scores = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 3, 0};
        int newscore = 1;
        int places = 10;

        int expected = 10;
        int actual = solution.getRank(scores, newscore, places);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] scores = new int[]{2000000000, 19539, 19466, 19146, 17441, 17002, 16348, 16343, 15981, 15346, 14748, 14594, 13752, 13684, 13336, 13290, 12939, 12208, 12163, 12133, 11621, 11119, 10872, 10710, 10390, 9934, 9296, 8844, 8662, 8653, 8168, 7914, 7529, 7354, 6016, 5428, 5302, 5158, 4853, 4538, 4328, 3443, 3222, 2107, 2107, 1337, 951, 586, 424, 31};
        int newscore = 1337;
        int places = 50;

        int expected = 46;
        int actual = solution.getRank(scores, newscore, places);

        Assert.assertEquals(expected, actual);
    }

}
