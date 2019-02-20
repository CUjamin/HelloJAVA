package cuj.anything.annotation;

import java.lang.annotation.*;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 11:56
 * @Description:
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    public enum Color{BLUE,RED,GREEN};
    Color fruitColor()default Color.GREEN;
}
