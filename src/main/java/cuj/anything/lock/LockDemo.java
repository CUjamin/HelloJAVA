package cuj.anything.lock;

import java.util.concurrent.locks.*;

/**
 * Created by cujamin on 2017/8/22.
 */
public class LockDemo {
    public static void main(String[]args)
    {
        int i = 1;
        ReentrantLock lock = new ReentrantLock(true);
        lock.lock();
        System.out.println("lock");
        lock.unlock();
        lock.getHoldCount();
        lock.getQueueLength();
        lock.getWaitQueueLength(null);
        lock.hasQueuedThread(null);
        lock.hasQueuedThreads();
        lock.getHoldCount();
        int j=2;
    }
}