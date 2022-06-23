package Inheritance;

public class PapaNosa {
	private Walk walk;
	private Pray pray;

	public PapaNosa(Walk walk, Pray pray){
		this.pray = pray;
		this.walk = walk;
	}


	public void pray(){
		this.pray.pray();
	}

	public void setPray(Pray pray) {
		this.pray = pray;
	}

	public void walk(){
		this.walk.walk();
	}
}