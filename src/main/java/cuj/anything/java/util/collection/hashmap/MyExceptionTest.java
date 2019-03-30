package cuj.anything.java.util.collection.hashmap;

import org.apache.log4j.Logger;

/**
 * Created by cujamin on 2017/12/22.
 */
public class MyExceptionTest {
    public static final int print = 1;
    private static Logger logger = Logger.getLogger(MyExceptionTest.class);
    public void print(int num)
    {
        try
        {
            if(num<100)
            {
                throw new MyException();
            }
        }catch (MyException my)
        {
            logger.info("catch the MyException:"+my);

            my.printStackTrace();
        }
    }
}
