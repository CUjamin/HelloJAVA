package cuj.anything.reflect.cglib;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 10:25
 * @Description:
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void say1(String name) {
        System.out.println(name+":"+1);
    }

    @Override
    public void say2(String name) {
        System.out.println(name+":"+2);
    }

    public void say3(String name) {
        System.out.println(name+":"+3);
    }
}
