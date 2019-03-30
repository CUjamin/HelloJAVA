package cuj.anything.java.lang.annotation;

import java.lang.reflect.Field;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 13:25
 * @Description:
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = (FruitName)field.getAnnotation(FruitName.class);
                System.out.println("FruitName:"+fruitName.value());
            }else if (field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = (FruitColor) field.getAnnotation(FruitColor.class);
                System.out.println("FruitColor:"+fruitColor.fruitColor());
            }else if (field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = (FruitProvider) field.getAnnotation(FruitProvider.class);
                System.out.println("FruitProvider:"+fruitProvider.toString());
            }else {
                System.out.println("ELSE");
            }
        }
    }
}
