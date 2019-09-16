package test;

class MyThread implements Runnable {
	int x = 500;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x = 0; x < 10; x ++) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			System.out.println(Thread.currentThread().getName() + ":" + x);
//			if(x == 3 && !"第3个".equals(Thread.currentThread().getName()))
//				try {
//					JavaThread.TMt3.join();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		}
	}

}
 public class JavaThread{
	 public static MyThread Mt3 = new MyThread();
	 public static Thread TMt3 = new Thread(Mt3,"第3个");
	  public static void main(String args[]) throws InterruptedException {
		  MyThread Mt1 = new MyThread();
		  MyThread Mt2 = new MyThread();
		  
		  MyThread Mt4 = new MyThread();
		  MyThread Mt5 = new MyThread();
		  MyThread Mt6 = new MyThread();
		  //new Thread(Mt,"第一个").start();
		  Thread TMt1 = new Thread(Mt1,"第1个");
		  Thread TMt2 = new Thread(Mt2,"第2个");
		  
		  Thread TMt4 = new Thread(Mt4,"第4个");
		  Thread TMt5 = new Thread(Mt5,"第5个");
		  Thread TMt6 = new Thread(Mt6,"第6个");
		  TMt1.start();
		  TMt1.join();
		  TMt2.start();
		  TMt2.join();
		  TMt3.start();
		  
		  TMt3.join();
		  TMt4.start();
		  TMt5.start();
		  TMt6.start();
		  //TMt1.join();
		  //TMt2.join();
		  
		  

//		  new Thread(() -> {
//			  for(int x = 0; x < Integer.MAX_VALUE; x ++)
//			  {
//				  System.out.println(x*x);
//			  }
//		  }).start();
//		  new Thread(new MyThread(),"第六个").start();
	  }
 }
