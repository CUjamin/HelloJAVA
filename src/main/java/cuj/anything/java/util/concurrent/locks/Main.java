package cuj.anything.java.util.concurrent.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by cujamin on 2017/5/10.
 */
public class Main {
    Lock lock = new ReentrantReadWriteLock().readLock();
    public static int i=  0;

    public void testLock () {
        lock.lock();
        try{
            int j = 1;
            i = j + 1;
        } finally {
            lock.unlock();
        }
    }
    public synchronized void test()
    {

    }
}
