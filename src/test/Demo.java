package test;

import java.math.BigDecimal;

public class Demo {

	public static void main(String[] args) {  
		float a = 1.0f - 0.9f;
		float x = 0.9f;
        Double b = (double) (0.7f - 0.6f);
        System.out.println(a);
        int c=Float.floatToIntBits(x);
        System.out.println(Integer.toBinaryString(c));
        System.out.println(b);
        if (a == b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
		
        
    }  
  
	public static int fun(int x,int y) {
		// 测试
		return x + y;
		
	}

	/** 
     * �ݹ��㷨ʵ�� 
     */  
    public static int foo(int i){  
        if(i<=0)  
            return 0;  
        else if(i>0 && i<=2)  
            return 1;  
        System.out.println(i);
        return foo(i-1) + foo(i-2);  
    }

}
