package test;

public class Demo1 {

	  public static void main(String[] args) {  
	        System.out.println("����ǣ�"+Demo1.foo(100));  
	    }  
	 
	    /** 
	     * �����ⷨ 
	     */  
	    public static long foo(long i){  
	    	long a=1,b=1;
	    	long c=0;
	    	for(long k=2;k<i;k++){//ע��ѭ������
	    		c=a+b;
	    		a=b;//ע�����Ҫ����b=c֮ǰ
	    		b=c;		
	    	}
	    return c;	
	   } 

}
