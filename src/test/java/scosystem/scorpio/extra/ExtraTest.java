package scosystem.scorpio.extra;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class ExtraTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testError() throws Exception {

        StepExample step = new StepExample();
        step.go();

        Assert.assertTrue(true);
    }
}
