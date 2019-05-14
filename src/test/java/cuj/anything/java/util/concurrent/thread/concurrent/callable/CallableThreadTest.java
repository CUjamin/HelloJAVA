package cuj.anything.java.util.concurrent.thread.concurrent.callable;

import org.junit.Test;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: cujamin
 * @Date: 2019/3/8 16:52
 * @Description:
 */
public class CallableThreadTest {

    @Test
    public void setCount() {
    }

    @Test
    public void call() {

        Callable callable = new CallableThread();

        FutureTask<Integer> result = new FutureTask<>(callable);
        new Thread(result).start();
        try{
            Integer countresult = result.get();
            System.out.println(countresult);
        }catch (InterruptedException ie){
            System.out.println("InterruptedException");
        }catch (ExecutionException e){
            System.out.println("ExecutionException");
        }
    }
}