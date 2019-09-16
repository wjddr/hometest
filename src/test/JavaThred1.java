package test;

import java.util.ArrayList;
import java.util.List;

public class JavaThred1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class shenchan implements Runnable{
	private Resource resource;
	public shenchan(Resource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 50; i ++) {
			try {
				this.resource.make();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
class Resource{
	private List<Computer> list= new ArrayList<Computer>();
//	private int comcount = 0;
	public synchronized void make() throws Exception {
		if(list.size() > 10) {
			this.wait();
		}
		list.add(new Computer("名字",2.3));
		this.notifyAll();
	}
	
	public synchronized void get() throws Exception {
		if(list.size() < 1) {
			this.wait();
		}else {
			list.remove(list.size() - 1);
		}
		this.notifyAll();
	}
}

class Computer{
	private int count = 0;
	private String name = null;
	private double price;
	
	public Computer(String name , double price) {
		this.name = name;
		this.price = price;
		this.count++;
	}
	
	public String toString() {
		return("第" + this.count++ + "台电脑:" + this.name + ";价格:" + this.price);
	}
}

