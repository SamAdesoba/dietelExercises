package Polymorphism;

public class Rat extends Animal{

	@Override
	public void move(){
		System.out.println("Move like a rat");
	}

	public void visitAmaka(){
		System.out.println("Eat Amaka first Name");
	}
}
