package test;

import java.lang.management.ManagementFactory;
import java.util.List;

public class JavaSize {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long b=System.currentTimeMillis();
		for(int i = 0;i < 10000000; i ++) {
			Integer integer = new Integer(1111111);
		}
		long e=System.currentTimeMillis();
		System.out.println("消耗时间为:" + (e - b)); 
		 List<String> paramters = ManagementFactory.getRuntimeMXBean().getInputArguments();  
	      for(String p : paramters){  
	          System.out.println(p);  
	      }  
	}
}

class Memtest {
	//int x = 0;
	//int y = 0;
	//int z = 0;
	Integer inth = new Integer(1000);
}