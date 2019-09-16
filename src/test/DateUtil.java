package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class DateUtil {
	  private DateUtil(){}
	    
	    //private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    private static  AtomicInteger icount = new AtomicInteger(0);

	    public static void main(String[] args) throws InterruptedException {
	        ExecutorService executorService = Executors.newFixedThreadPool(500);
	        for (int i = 0; i < 50; i++) {
	            executorService.execute(new Runnable() {
	                @Override
	                public void run() {
	                    for (int j = 0; j < 10000; j++) {
	                    	try {
								new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2014-01-01 00:00:00");
							} catch (ParseException e) {
								// TODO 自动生成的 catch 块
								e.printStackTrace();
							}
	                    	//++icount;
	                        //System.out.println(Thread.currentThread().getName() + ";" +  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2014-01-01 00:00:00").toString());
							//if(icount % 10000 == 0)
								System.out.println(icount.incrementAndGet());
	                    }
	                }
	            });
	            System.out.println("***********************" + i + "********************");
	        }
	        System.out.println("***********************-----------" + icount + "-----------********************");
	        //Thread.sleep(3000000);
	    }
}
