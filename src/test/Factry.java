package test;

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

public class Factry {	
	public static void main(String[] args) {
		IFood food = new Zuofan(Chisha.getInstance("Meat"));
		food.eat();
	}
}
