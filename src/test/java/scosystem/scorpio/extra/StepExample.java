package scosystem.scorpio.extra;

import scosystem.scorpio.extra.annotation.ExtraFlag;

/**
 * @author chinawym@gmail.com
 * @since 2015-03-24
 */
public class StepExample {

    public void step1() {
        System.out.println("step1");
    }

    @ExtraFlag
    public void step2(int stepNumber) {
        System.out.println("step" + stepNumber);
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
