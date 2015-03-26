package scosystem.scorpio.extra;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class ExtraTest {

    @Test
    public void testStepBizExample() throws Exception {

        StepBizExample step = new StepBizExample();
        step.go();

        Assert.assertTrue(true);
    }
}
