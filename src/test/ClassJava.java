package test;

import java.util.Date;

public class ClassJava {

	public static void main(String[] args) {
		Class<Date> date = Date.class;
		System.out.println(date.getClass());
		System.out.println(date.getClassLoader().getSystemClassLoader());
		System.out.println(date.getClassLoader().getSystemClassLoader().getParent());
		System.out.println(date.getClassLoader().getSystemClassLoader().getParent().getParent());
	}

}
