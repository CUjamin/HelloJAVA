package cuj.anything.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by cujamin on 2017/9/5.
 */
public class BlockingQueueExample {
    public static void main(String[] args) {


    }
    public static void delayQueueTest()
    {

    }
    public static void arrayBlockingQueueTest() throws Exception
    {
        BlockingQueue queue = new ArrayBlockingQueue(1024);
        queue.put("i1");
        queue.put("i2");
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
    }
}
