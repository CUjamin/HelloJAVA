package cuj.anything.java.util.concurrent.locks.sychronized;

/**
 * @Author: cujamin
 * @ProjectName: HelloJAVA
 * @Date: 2019/5/8 10:31 PM
 * @Description: 对象锁实例1
 */
public class SynchronizedObjectBlock2 implements Runnable {
    private static SynchronizedObjectBlock2 instance = new SynchronizedObjectBlock2();

    Object lock1 = new Object();
    Object lock2 = new Object();


    public static void main(String[] args) {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()) {

        }
        System.out.println("finished");
    }

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("我是对象锁lock1的代码块形式，我叫" + Thread.currentThread().getName());
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "lock1 运行结束。");
        }


        synchronized (lock2) {
            System.out.println("我是对象锁lock2的代码块形式，我叫" + Thread.currentThread().getName());
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "lock2 运行结束。");
        }
    }
}
