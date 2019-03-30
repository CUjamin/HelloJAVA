package cuj.anything.java.lang.annotation;

import java.lang.annotation.*;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 11:32
 * @Description:
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {
    String[] value() default {};//可接受value值
}
