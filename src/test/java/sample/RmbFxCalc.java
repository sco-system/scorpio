package sample;

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
     * @param yuan 输入元
     */
    public void run(final BigDecimal yuan) {
        if (null != yuan) {
            compute(yuan);
        }
    }

    /**
     * 人民币换美元
     *
     * @param yuan 人民币元
     * @return 兑后美元
     */
    @SPI
    private BigDecimal compute(final BigDecimal yuan) {
        BigDecimal result = null;

        if (null != yuan) {
            result = new BigDecimal(yuan.longValue() * 0.157).setScale(2, RoundingMode.HALF_UP);
            System.out.println(String.format("人民币 %s 元兑换 %s 美元", yuan, result));
        }

        return result;
    }
}
