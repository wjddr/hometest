package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

	public static void main(String[] args) {
		Threads s=new Threads();
        Thread t1= new Thread(s, "窗口1");
        Thread t2= new Thread(s, "窗口2");
        Thread t3= new Thread(s, "窗口3");
        Thread t4= new Thread(s, "窗口4");
        Thread t5= new Thread(s, "窗口5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
	}

}
class Threads implements Runnable{
    // 定义火车票
    private int tickets = 200;
    // 定义锁对象
    private Lock  lock = new ReentrantLock();
    @Override
    public void run() {
 
        while (lock.tryLock()) {
            try {
                // 加锁
                
                //***************业务处理******************
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "正在出售第" + (tickets--) + "张票");
                    //lock.unlock();
                    break;
                }else {
                    break;
                }
                //*****************************************
            }finally {
                 // 释放锁
                 lock.unlock();
            }
        }
 
    }
}