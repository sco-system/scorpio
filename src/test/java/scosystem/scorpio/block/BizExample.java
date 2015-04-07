package scosystem.scorpio.block;

import scosystem.scorpio.block.annotation.BlockMethodFlag;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class BizExample {

    public void step1() {
        System.out.println("step1");
    }

    @BlockMethodFlag
    public void step2(int stepNum) {
        System.out.println("step" + stepNum);
    }

    public void step3() {
        System.out.println("step3");
    }

    public void go() {
        step1();
        step2(2);
        step3();
    }
}
