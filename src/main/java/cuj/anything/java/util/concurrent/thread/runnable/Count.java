package cuj.anything.java.util.concurrent.thread.runnable;

/**
 * Created by cujamin on 2017/8/15.
 */
public class Count {

    public void count()
    {
        int num = 0;
        for(int i=0;i<=10;++i)
        {
            num+=i;
        }
        System.out.println(Thread.currentThread().getName()+"-"+num);
    }
}
