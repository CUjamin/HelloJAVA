package cuj.anything.java.util.concurrent.locks.sychronized;

/**
 * @Author: cujamin
 * @ProjectName: HelloJAVA
 * @Date: 2019/5/8 10:49 PM
 * @Description: 对象锁实例2 ，方法锁形式
 */
public class SynchronizedObjectMethod3 implements Runnable{
    static SynchronizedObjectMethod3 instance = new SynchronizedObjectMethod3();

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
        method();
    }
    public synchronized void method(){
        System.out.println("我是对象锁的方法修饰符形式，我叫:"+Thread.currentThread().getName());
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"运行结束");

    }
}
