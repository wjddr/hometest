package test;

import java.io.UnsupportedEncodingException;

public class CharTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String a = "名";
		PrintByte(a.getBytes());
		PrintByte(a.getBytes("UTF-8"));
		System.out.println("UTF-8编码长度:"+a.getBytes("UTF-8").length);
		PrintByte(a.getBytes("GBK"));
        System.out.println("GBK编码长度:"+a.getBytes("GBK").length);
        PrintByte(a.getBytes("GB2312"));
        System.out.println("GB2312编码长度:"+a.getBytes("GB2312").length);
        System.out.println("==========================================");

        String c = "0x20001";
        //PrintByte(c.getBytes());
        //PrintByte(c.getBytes("UTF-8"));
        System.out.println("UTF-8编码长度:"+c.getBytes("UTF-8").length);
        //PrintByte(c.getBytes("GBK"));
        System.out.println("GBK编码长度:"+c.getBytes("GBK").length);
        //PrintByte(c.getBytes("GB2312"));
        System.out.println("GB2312编码长度:"+c.getBytes("GB2312").length);
        System.out.println("==========================================");

        char[] arr = Character.toChars(0x20001);
        String s = new String(arr);
        PrintByte(s.getBytes());
        System.out.println("char array length:" + arr.length);
        System.out.println("content:|  " + s + " |");
        System.out.println("String length:" + s.length());
        PrintByte(s.getBytes("UTF-8"));
        System.out.println("UTF-8编码长度:"+s.getBytes("UTF-8").length);
        PrintByte(s.getBytes("GBK"));
        System.out.println("GBK编码长度:"+s.getBytes("GBK").length);
        PrintByte(s.getBytes("GB2312"));
        System.out.println("GB2312编码长度:"+s.getBytes("GB2312").length);
        System.out.println("==========================================");

	}
	
	static void PrintByte(byte[] bys){
		for (int i = 0; i < bys.length; i++) {
	        System.out.printf("%X ", bys[i]);
	    }
		System.out.println();
	}

}
