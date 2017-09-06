package cuj.anything.spring.aop;

import cuj.anything.spring.aop.bean.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cujamin on 2017/8/26.
 */
@Configuration
@ComponentScan
public class AopDemo {

    static IUser user ;

    @Autowired
    public void init(IUser iUser)
    {
        user = iUser;
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopDemo.class);
        user.findAll();
        user.addUser("test");
    }
}
