package test;

class Person {

	public Person() {
		System.out.println("Person已经初始化");
	}

	public void con() {
		System.out.println("Person的con已经初始化");
	}

	public void man() {
		System.out.println("man");
	}
}

class Son extends Person {

	public Son() {
		System.out.println("Son已经初始化");

	}
	
	public void child() {
		System.out.println("child");
	}

	@Override
	public void con() {
		super.con();
		System.out.println("Son的con已经初始化");
	}
}

public class Child {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person per = new Person();
		per.man();
		Son son = (Son)per;
		son.child();

	}

}
