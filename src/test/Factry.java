package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IFood {
	public void eat();
}

class Bread implements IFood{
	@Override
	public void eat() {
		System.out.println("吃面包");
		
	}
}

class Meat implements IFood{
	@Override
	public void eat() {
		System.out.println("吃肉");
		
	}
}

class Chisha{
	public static IFood getInstance(String className) {
		if("Bread".equals(className)){
			return new Bread();			
		}
		if("Meat".equals(className)){
			return new Meat();
		}
		return null;
	}
}

class Zuofan implements IFood{
	private IFood food;
	public Zuofan(IFood food) {
		this.food = food;
	}
	private void maicai() {
		System.out.println("买菜了");
	}
	
	private void shoushi() {
		System.out.println("收拾干净了");
	}
	@Override
	public void eat() {
		maicai();
		this.food.eat();
		shoushi();
	}
}

class DouPorxy implements InvocationHandler{
	private Object target;
	public Object bind(Object target){
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				this); 
	}
	
	private void maicai() {
		System.out.println("動態买菜了");
	}
	
	private void shoushi() {
		System.out.println("動態收拾干净了");
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		maicai();
		method.invoke(this.target, args);
		shoushi();
		return null;
	}
}

public class Factry {	
	public static void main(String[] args) {
		IFood food = (IFood)new DouPorxy().bind(new Meat());
		food.eat();
	}
}
