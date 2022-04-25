package DataStructureAndAlgorithm;

public class Stack {
	private boolean isEmpty = true;
	private int numberOfNumberElement;
	private int[] elements = new int[5];


	public boolean isEmpty() {
		if(numberOfNumberElement == 0) return true;
		else return false;
	}

	public void push(int element) {
		elements[numberOfNumberElement] = element;
		numberOfNumberElement++;
	}

	public int pop() {
		numberOfNumberElement--;
		return elements[numberOfNumberElement];
	}

	public int peek() {

		return elements[numberOfNumberElement-1];
	}
}
