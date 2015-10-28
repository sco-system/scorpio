package scorpio.extension.entity.annotation;

import java.lang.annotation.*;

/**
 * @author xuanyin
 * @since 2015-10-28
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface SPI {
}
