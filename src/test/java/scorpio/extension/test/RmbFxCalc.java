package scorpio.extension.test;

import scorpio.extension.entity.annotation.SPI;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 人民币兑换
 *
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public final class RmbFxCalc {
    /**
     * @param input 输入元
     * @return 兑换元
     */
    public BigDecimal run(final BigDecimal input) {
        BigDecimal result = null;

        if (null != input) {
            result = compute(input.longValue());
        }

        return result;
    }

    /**
     * 人民币换美元
     *
     * @param cent 分
     * @return 元
     */
    @SPI
    private BigDecimal compute(final long cent) {
        BigDecimal result = null;

        if (0L < cent) {
            result = new BigDecimal(cent * 0.157).setScale(2, RoundingMode.HALF_UP);
        }

        return result;
    }
}
