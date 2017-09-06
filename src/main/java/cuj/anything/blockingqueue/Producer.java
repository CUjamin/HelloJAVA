package cuj.anything.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by cujamin on 2017/9/5.
 */
public class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println("Producer Producted 1");
            queue.put("1");

            Thread.sleep(1000);
            System.out.println("Producer Producted 2");
            queue.put("2");

            Thread.sleep(1000);
            System.out.println("Producer Producted 3");
            queue.put("3");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
