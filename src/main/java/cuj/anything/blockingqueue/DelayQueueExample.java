package cuj.anything.blockingqueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

/**
 * Created by cujamin on 2017/9/5.
 */
public class DelayQueueExample {

    public static void main(String[] args) throws Exception{
        DelayQueue queue = new DelayQueue();

        Delayed element1 = new DelayedElement();

        queue.put(element1);

        Delayed element2 = queue.take();
    }
}