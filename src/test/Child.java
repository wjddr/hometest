package test;

class Person {

	public Person() {
		System.out.println("Person�Ѿ���ʼ��");
	}

	public void con() {
		System.out.println("Person��con�Ѿ���ʼ��");
	}

	public void man() {
		System.out.println("man");
	}
}

class Son extends Person {

	public Son() {
		System.out.println("Son�Ѿ���ʼ��");

	}
	
	public void child() {
		System.out.println("child");
	}

	@Override
	public void con() {
		super.con();
		System.out.println("Son��con�Ѿ���ʼ��");
	}
}

public class Child {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Person per = new Person();
		per.man();
		Son son = (Son)per;
		son.child();

	}

}
