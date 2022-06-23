package Polymorphism;

public class Rabbit extends Animal{

	@Override
	public void move(){
		System.out.println("Move like a rabbit");
	}


	public void eat(){
		System.out.println("Eat carrot");
	}
}
