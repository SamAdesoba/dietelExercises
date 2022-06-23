package Polymorphism;

public class Forest {
	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		animals[0] = new Chicken();
		animals[1] = new Rat();
		animals[2] = new Rabbit();
		animals[3] = new Animal();


		for (var animal:animals
			  ) {
			animal.move();
		}


		Rabbit rabbit = new Rabbit();
		Animal rabbit2 = new Rabbit();



	}


}
