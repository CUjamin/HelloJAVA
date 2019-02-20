package cuj.anything.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 11:52
 * @Description:
 */


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface KakaConfiguration {
    String[] value() default {};
}
