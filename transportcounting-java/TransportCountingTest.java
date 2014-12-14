import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TransportCountingTest {

    protected TransportCounting solution;

    @Before
    public void setUp() {
        solution = new TransportCounting();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int speed = 100;
        int[] positions = new int[]{0};
        int[] velocities = new int[]{0};
        int time = 0;

        int expected = 1;
        int actual = solution.countBuses(speed, positions, velocities, time);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int speed = 5;
        int[] positions = new int[]{10, 10};
        int[] velocities = new int[]{0, 1};
        int time = 2;

        int expected = 1;
        int actual = solution.countBuses(speed, positions, velocities, time);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int speed = 5;
        int[] positions = new int[]{10, 10};
        int[] velocities = new int[]{0, 1};
        int time = 3;

        int expected = 2;
        int actual = solution.countBuses(speed, positions, velocities, time);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int speed = 777;
        int[] positions = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490, 500};
        int[] velocities = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490, 500};
        int time = 333;

        int expected = 50;
        int actual = solution.countBuses(speed, positions, velocities, time);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int speed = 5;
        int[] positions = new int[]{0, 0, 0};
        int[] velocities = new int[]{4, 5, 6};
        int time = 10;

        int expected = 3;
        int actual = solution.countBuses(speed, positions, velocities, time);

        Assert.assertEquals(expected, actual);
    }

}
