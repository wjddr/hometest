package test;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;

public class TestMem {
	public static void main(String[] args) throws Exception {
		 
        byte[] array = new byte[70 * 1024 * 1024];//734003216
		 for(byte b : array){
			 
		 }
        for (MemoryPoolMXBean memoryPoolMXBean : ManagementFactory.getMemoryPoolMXBeans()) {
 
            System.out.println(memoryPoolMXBean.getName() + "  总量:" + memoryPoolMXBean.getUsage().getCommitted()/1024 + "K   使用的内存:" + memoryPoolMXBean.getUsage().getUsed()/1024 + "K");
        }
 
    }
}
