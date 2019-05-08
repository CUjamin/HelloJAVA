package cuj.anything.java.util.concurrent.locks.sychronized;

/**
 * @Author: cujamin
 * @ProjectName: HelloJAVA
 * @Date: 2019/5/8 10:14 PM
 * @Description: 消失的请求数
 */
public class DisappearRequest1 implements Runnable{
    private static DisappearRequest1 disappearRequest1 = new DisappearRequest1();

    static int i=0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(disappearRequest1);
        Thread thread2 = new Thread(disappearRequest1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(i);

    }
    @Override
    public void run(){
        for(int j=0;j<100000;++j){
            //count++,本质上是三个操作：
            //1.读取count
            //2.给count加1
            //3.将count写入内存
            i++;
        }

    }
}
