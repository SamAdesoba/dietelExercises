package Polymorphism;

public class Chicken extends Animal{

	@Override
	public void move(){
		System.out.println("Move like a chicken");
	}

	public void die(){
		System.out.println("Die like a chicken");
	}
}
