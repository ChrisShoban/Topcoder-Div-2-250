import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class bloggoShortcutsTest {

    protected bloggoShortcuts solution;

    @Before
    public void setUp() {
        solution = new bloggoShortcuts();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String text = "You _should_ see the new walrus at the zoo!";

        String expected = "You <i>should</i> see the new walrus at the zoo!";
        String actual = solution.expand(text);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String text = "Move it from *Accounts Payable* to *Receiving*.";

        String expected = "Move it from <b>Accounts Payable</b> to <b>Receiving</b>.";
        String actual = solution.expand(text);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String text = "I saw _Chelydra serpentina_ in *Centennial Park*.";

        String expected = "I saw <i>Chelydra serpentina</i> in <b>Centennial Park</b>.";
        String actual = solution.expand(text);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String text = " _ _ __  _ yabba dabba _   *  dooooo  * ****";

        String expected = " <i> </i> <i></i>  <i> yabba dabba </i>   <b>  dooooo  </b> <b></b><b></b>";
        String actual = solution.expand(text);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String text = "_now_I_know_*my*_ABC_next_time_*sing*it_with_me";

        String expected = "<i>now</i>I<i>know</i><b>my</b><i>ABC</i>next<i>time</i><b>sing</b>it<i>with</i>me";
        String actual = solution.expand(text);

        Assert.assertEquals(expected, actual);
    }

}
