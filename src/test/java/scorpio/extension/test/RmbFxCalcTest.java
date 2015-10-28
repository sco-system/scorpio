package scorpio.extension.test;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class RmbFxCalcTest {
    @Test
    public void testExample() throws Exception {
        RmbFxCalc rmbFxCalc = new RmbFxCalc();
        BigDecimal result = rmbFxCalc.run(new BigDecimal(100));
        if (null != result) {
            System.out.println(result);
        }

        Assert.assertTrue(true);
    }
}
