package DataStructureAndAlgorithm;

public class MyQueue {
	private int counter;
	private boolean isEmpty = true;
	private boolean isNotEmpty =false;
	private String db[] = new String[4];

	public boolean isEmpty() {
		if(counter == 0) {
			return isEmpty;
		}
		return isNotEmpty;
	}

	public void push(String element) {
		db[counter] = element;
		counter++;
	}

	public boolean isNotEmpty() {
		return isNotEmpty;
	}

	public String peek() {
		counter = 0;
		return db[counter];
	}
}
