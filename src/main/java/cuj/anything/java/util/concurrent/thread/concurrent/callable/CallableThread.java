package cuj.anything.java.util.concurrent.thread.concurrent.callable;

import java.util.concurrent.Callable;

/**
 * @Auther: cujamin
 * @Date: 2019/3/8 16:24
 * @Description:
 */
public class CallableThread implements Callable<Integer>{
    private int count=10;

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public Integer call()throws Exception{
        int sum = 100;
        return sum*count;
    }
}
