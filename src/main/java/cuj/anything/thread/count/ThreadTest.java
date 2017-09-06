package cuj.anything.thread.count;


import java.util.Date;
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
