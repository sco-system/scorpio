package scosystem.scorpio.extra;

import scosystem.scorpio.extra.annotation.ExtraImpl;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class ExtraExample {

    @ExtraImpl
    public void step2(int stepNumber) {
        System.out.println("(extra) step" + stepNumber);
    }
}
