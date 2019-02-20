package cuj.anything.thread.pool;

/**
 * @Auther: cujamin
 * @Date: 2018/10/30 15:35
 * @Description:
 */
public class TestThread extends Thread{
    private int num;
    public TestThread(int num) {
        this.num = num;
    }

    public void run(){
        System.out.println("this is "+num+" start "+Thread.currentThread().getId());
        try {
            Thread.sleep(5 * 1000);
        }catch (InterruptedException ie){
            System.out.println(num+" - InterruptedException:"+ie);
        }
        System.out.println("this is "+num+" start end"+Thread.currentThread().getId());
    }
}
