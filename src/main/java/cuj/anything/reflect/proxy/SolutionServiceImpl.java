package cuj.anything.reflect.proxy;

/**
 * @Auther: cujamin
 * @Date: 2019/2/18 10:41
 * @Description:
 */
public class SolutionServiceImpl implements SolutionService {
    @Override
    public String sayHello(String name) {
        System.out.println("in the SolutionService:"+name);
        return "SolutionService:"+name;
    }
}
