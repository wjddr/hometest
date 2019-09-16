package test;

public class Demo {

	public static void main(String[] args) {  
        fun(2,6);
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
