package scosystem.scorpio.block;

import scosystem.scorpio.block.annotation.BlockMethodImpl;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class BlockMethodImplExample {

    @BlockMethodImpl
    public void step2(int stepNumber) {
        System.out.println("(extra) step" + stepNumber);
    }
}
