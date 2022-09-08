package Test;

public class Dog {
	protected String name;
	protected int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void speak() {
		System.out.println("I am " + this.name + " and I am " + this.age + " years old.");
	}
}
