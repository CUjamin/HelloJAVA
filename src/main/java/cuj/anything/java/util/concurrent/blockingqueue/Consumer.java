package cuj.anything.java.util.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by cujamin on 2017/9/5.
 */
public class Consumer implements Runnable{

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println("Consumer get "+queue.take());
            System.out.println("Consumer get "+queue.take());
            System.out.println("Consumer get "+queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
