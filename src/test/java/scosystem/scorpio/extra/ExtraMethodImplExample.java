package scosystem.scorpio.extra;

import scosystem.scorpio.extra.annotation.ExtraMethodImpl;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class ExtraMethodImplExample {

    @ExtraMethodImpl
    public void step2(int stepNumber) {
        System.out.println("(extra) step" + stepNumber);
    }
}
