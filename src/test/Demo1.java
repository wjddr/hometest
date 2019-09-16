package test;

public class Demo1 {

	  public static void main(String[] args) {  
	        System.out.println("结果是："+Demo1.foo(100));  
	    }  
	 
	    /** 
	     * 常见解法 
	     */  
	    public static long foo(long i){  
	    	long a=1,b=1;
	    	long c=0;
	    	for(long k=2;k<i;k++){//注意循环次数
	    		c=a+b;
	    		a=b;//注意这句要放在b=c之前
	    		b=c;		
	    	}
	    return c;	
	   } 

}
