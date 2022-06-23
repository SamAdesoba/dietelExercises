package Inheritance;

public class Main {
	public static void main(String[] args) {
		Pray1 pray1 = new Pray1();
		Walk walk = new Walk();
		Pray2 pray2 = new Pray2();

		PapaNosa nosa = new PapaNosa(walk, pray2);

		nosa.pray();




		nosa.setPray(pray1);

		nosa.pray();






	}
}
