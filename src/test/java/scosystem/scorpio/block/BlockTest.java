package scosystem.scorpio.block;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class BlockTest {

    @Test
    public void testStepBizExample() throws Exception {

        BizExample step = new BizExample();
        step.go();

        Assert.assertTrue(true);
    }
}
