package cuj.anything.java.util.concurrent.locks.sychronized;

/**
 * @Author: cujamin
 * @ProjectName: HelloJAVA
 * @Date: 2019/5/8 10:07 PM
 * @Description: 对象锁实例1
 */
public class SynchronizedDemo {
// 同步方法支持一种简单的策略来防止线程干扰和内存不一致错误：如果也对相对于多个线程可见，
// 则对该对象变量的所有读取或者写入都是通过同步方法完成的。

//    能够保证同一时刻，只有一个线程执行该代码，以达到保证并发安全的效果

//    对象锁：      方法锁             synchronized 修饰普通方法，锁对象默认为this
//                 同步代码块锁       手动指定锁对象



//    类锁：        概念：        Java虽然可能有很多个对象，但只有一个Class对象
//                 本质：        所谓的类锁，不过是Class对象的锁而已
//                 用法和效果：   类锁智能在同一时刻被一个对象拥有

//
//
//                 静态方法           synchronized 加在 static 方法上
//

//                 Class对象         synchonized （*.class）代码块






}
