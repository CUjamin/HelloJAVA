package cuj.anything.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by cujamin on 2017/8/24.
 */

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootDemo {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootDemo.class, args);
    }
}
