package DependencyInversion;

public class Animal {
	private Movement movement = new Fly();

	public Animal() {
	}

	public Movement getMovement() {
		return movement;
	}

	public void setMovement(Movement movement) {
		this.movement = movement;
	}

	public void move(){
		System.out.println("I move like an animal");
	}
}
