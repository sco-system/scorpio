package sample;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class SampleTest {
    @Test
    public void test() throws Exception {
        RmbFxCalc rmbFxCalc = new RmbFxCalc();
        rmbFxCalc.run(new BigDecimal(100));

        Assert.assertTrue(true);
    }
}
