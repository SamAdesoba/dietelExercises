package Inheritance1;

public class Animal extends LivingThings{

	public Animal(){
		System.out.println("I am an animal");
	}
	@Override
	public void move(){
		super.move();
		System.out.println("Move like animal");
	}

	public void livingThingMove(){
		super.move();
	}

}
