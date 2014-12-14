import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SignatureDecoratorTest {

    protected SignatureDecorator solution;

    @Before
    public void setUp() {
        solution = new SignatureDecorator();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String name = "Bob";
        String[] commands = new String[]{"surround", "append", "prepend"};
        String[] decorations = new String[]{"-=", "(", ")"};

        String expected = ")-=Bob=-(";
        String actual = solution.applyDecoration(name, commands, decorations);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String name = "Super_Man_01";
        String[] commands = new String[]{};
        String[] decorations = new String[]{};

        String expected = "Super_Man_01";
        String actual = solution.applyDecoration(name, commands, decorations);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String name = "4BcD3FgHIjklMN0pqrS7uVWxYZ_";
        String[] commands = new String[]{"append", "prepend", "surround"};
        String[] decorations = new String[]{"`{[(", ")]}'", ",.;<>?:|-=_+!@#$%^&*~"};

        String expected = ",.;<>?:|-=_+!@#$%^&*~)]}'4BcD3FgHIjklMN0pqrS7uVWxYZ_`{[(~*&^%$#@!+_=-|:?><;.,";
        String actual = solution.applyDecoration(name, commands, decorations);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String name = "RacEcaR";
        String[] commands = new String[]{"surround"};
        String[] decorations = new String[]{"([{/"};

        String expected = "([{/RacEcaR/{[(";
        String actual = solution.applyDecoration(name, commands, decorations);

        Assert.assertEquals(expected, actual);
    }

}
