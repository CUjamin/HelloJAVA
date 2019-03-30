package cuj.anything.java.util.concurrent.blockingqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by cujamin on 2017/9/5.
 */
public class DelayedElement implements Delayed {

    public long getDelay(TimeUnit unit)
    {
        return 0;
    }
    public int compareTo(Delayed o)
    {
        return 0;
    }
}
