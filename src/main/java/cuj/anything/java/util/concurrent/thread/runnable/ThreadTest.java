package cuj.anything.java.util.concurrent.thread.runnable;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cujamin on 2017/8/15.
 */
public class ThreadTest {
    public static void main(String[]args)
    {
        try
        {
            MyThread myThread = new MyThread();

            /**
             * start()实际上是通过本地方法start0()启动线程的。
             * 而start0()会新运行一个线程，新线程会调用run()方法。
             */
            myThread.start();
            Thread.sleep(10);
            Thread.currentThread().interrupt();
//            myThread.interrupt();
            System.out.println("Main是否停止1 : " +Thread.interrupted());
            System.out.println("Main是否停止2 : " +Thread.interrupted());
            System.out.println("myThread是否停止1 : " +myThread.interrupted());
            System.out.println("myThread是否停止2 : " +myThread.interrupted());
            System.out.println("end");

            Lock lock = new ReentrantLock(true);

        }catch (InterruptedException e)
        {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
class MyThread extends Thread
{
    public void run()
    {
        super.run();
        for(int i=0;i<5000;++i)
        {
            System.out.println("i="+(i+1));
        }
    }
}
