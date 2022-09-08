package Test;

public class Cat extends Dog{
	protected int food;
	
	public Cat(String name, int age, int food){
		super(name, age);
		this.food = food;
	}
}
