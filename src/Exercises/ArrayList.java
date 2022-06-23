package Exercises;

import java.util.Arrays;

public class ArrayList {
	private static int counter;
	private static int length = 10;
	private static String[] arrays = new String[length];

	public void add(String element) {
		if(counter == 0) {
			arrays[counter] =element;
		}
		if(length == counter){
			increaseArrayLength();
		}
		arrays[counter] = element;
		counter++;
	}



	private void insert(int index, String element) {
		String[] arrays1 = new String[arrays.length+1];
		for (int i = 0; i < index; i++) {
			arrays1[i] = arrays[i];
		}
		arrays1[index] = element;
		for (int i = index; i < arrays1.length; i++) {
			arrays1[index +1] = arrays[index];
		}
		arrays=arrays1;
	}


	public int size() {
		if(counter < 0){
			counter = 0;
		}
		return counter;
	}

	public String get(int index) {
		return arrays[index];
	}

	public void remove(int index) {
		arrays[index] = null;
		for (int i = index; i < counter-1; i++) {
			if (arrays[i] == null){
				arrays[i] = arrays[i+1];
			}
		}
		counter--;
	}

	public void remove(String element) {
		for (int i = 0; i < counter; i++) {
			if (arrays[i].equals(element)){
				String temp = arrays[i+1];
				arrays[i] = arrays[i+1];
				arrays[i+1] = temp;
			}
		}
		counter--;
	}

	public void increaseArrayLength(){
		length = length * 2;
		String[] arrays1 = new String[length];
		for (int i = 0; i < length; i++){
			arrays1[i] = arrays[i];
		}
		arrays = arrays1;
	}

	public void removeAll() {
		for (int i = 0; i < arrays.length; i++) {
			remove(i);
		}
	}
}
