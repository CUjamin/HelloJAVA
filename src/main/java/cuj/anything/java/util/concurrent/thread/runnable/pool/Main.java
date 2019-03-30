package cuj.anything.java.util.concurrent.thread.runnable.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: cujamin
 * @Date: 2018/10/30 15:39
 * @Description:
 */
public class Main {
    private static ThreadPoolExecutor threadPoolExecutor;
    private static int POOL_SIZE = 10;
    public static void main(String[] args) {
        threadPoolExecutor = new ThreadPoolExecutor(POOL_SIZE*2,
                POOL_SIZE*2,
                30,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(1024),
                new ThreadFactoryBuilder().setNameFormat("outCall-pool-%s").build());

        start();
    }

    private static void start() {
        for(int i=0;i<POOL_SIZE*2;i++){
            TestThread testThread = new TestThread(i);
            threadPoolExecutor.execute(testThread);
        }
    }
}
