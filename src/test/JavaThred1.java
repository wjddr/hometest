package test;

import java.util.ArrayList;
import java.util.List;

public class JavaThred1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new Resource();
		Thread sc = new Thread(new shenchan(res));
		Thread xf = new Thread(new xiaofei(res));
		xf.setPriority(Thread.MAX_PRIORITY);
		sc.setPriority(Thread.MIN_PRIORITY);
		sc.start();
		xf.start();
	}

}
class xiaofei implements Runnable{
	private Resource resource;
	public xiaofei(Resource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 50; i ++) {
			try {
				this.resource.get();
				 System.out.println("卖出了:" + this.resource.mcount + "台电脑");
				 System.out.println("卖出后库存:" + this.resource.list.size() + "台电脑");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
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
				System.out.println("生产了:" + this.resource.comcount + "台电脑");
				System.out.println("库存:" + this.resource.list.size() + "台电脑");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}	
}
class Resource{
	public List<Computer> list= new ArrayList<Computer>();
	public int comcount = 0;
	public int mcount = 0;
	public synchronized void make() throws Exception {
		if(list.size() > 9) {
			System.out.println("仓库满了:"+ list.size() + "***************");
			this.wait();
		}else{			
			list.add(new Computer("名字",2.3));
			comcount++;
			//System.out.println("生产的:"+ this.list.get(list.size() - 1));
			//super.wait();
		}
		Thread.sleep(100);
		this.notify();
	}
	
	public synchronized void get() throws Exception {
		if(list.size() > 0) {
			list.remove(list.size() - 1);
			System.out.println("电脑卖了：" + ++mcount);
			//super.wait();
		}else {
			
			System.out.println("电脑卖完了");
			this.wait();
			//super.wait();
		}
		//System.out.println(this.list.get(list.size() - 1));
		Thread.sleep(100);
		this.notify();
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
		return("第" + this.count + "台电脑:" + this.name + ";价格:" + this.price);
	}
}

