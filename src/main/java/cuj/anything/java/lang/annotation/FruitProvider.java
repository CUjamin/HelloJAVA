package cuj.anything.java.lang.annotation;

import java.lang.annotation.*;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 12:00
 * @Description:
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    public int id() default -1;
    public String name() default "";
    public String address() default "";
}
