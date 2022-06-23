package Inheritance1;

public class Vertebrate extends Animal{

	public Vertebrate(){
		System.out.println("I am creating a vertebrate");
	}

	@Override
	public void move(){
		System.out.println("Move as a vertebrate animal");
	}
}
