package sample;

import scorpio.extension.entity.annotation.Extension;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author xuanyin
 * @since 2015-10-28
 */
public final class MethodExtension {
    /**
     * 美元换人民币
     *
     * @param cent 分
     * @return 元
     */
    @Extension
    public BigDecimal compute(final long cent) {
        BigDecimal result = null;

        if (0L < cent) {
            result = new BigDecimal(cent * 6.3683).setScale(2, RoundingMode.HALF_UP);
        }

        return result;
    }
}
