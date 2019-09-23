package test;

public class TestRuntime {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("Java进程可以向操作系统申请到的最大内存:"+(Runtime.getRuntime().maxMemory())/(1024*1024)+"M");
        System.out.println("Java进程空闲内存:"+(Runtime.getRuntime().freeMemory())/(1024*1024)+"M");
        System.out.println("Java进程现在从操作系统那里已经申请了内存:"+(Runtime.getRuntime().totalMemory())/(1024*1024)+"M");
		
        String str = "x";
		for(int x = 0; x < 30000; x ++){
			str += x;
		}
		//Thread.sleep(10000);
		System.out.println("Java进程可以向操作系统申请到的最大内存:" + (Runtime.getRuntime().maxMemory()) / (1024 * 1024) + "M");
		System.out.println("Java进程空闲内存:" + (Runtime.getRuntime().freeMemory()) / (1024 * 1024) + "M");
		System.out.println("Java进程现在从操作系统那里已经申请了内存:" + (Runtime.getRuntime().totalMemory()) / (1024 * 1024) + "M");
		Thread.sleep(20000);
		Runtime.getRuntime().gc();
		System.out.println("==============================================");
		System.out.println("Java进程可以向操作系统申请到的最大内存:" + (Runtime.getRuntime().maxMemory()) / (1024 * 1024) + "M");
		System.out.println("Java进程空闲内存:" + (Runtime.getRuntime().freeMemory()) / (1024 * 1024) + "M");
		System.out.println("Java进程现在从操作系统那里已经申请了内存:" + (Runtime.getRuntime().totalMemory()) / (1024 * 1024) + "M");
		
	}

}
