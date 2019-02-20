package cuj.anything.annotation;

import java.lang.annotation.*;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 12:55
 * @Description:
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
