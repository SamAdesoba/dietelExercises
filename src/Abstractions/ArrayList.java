package Abstractions;

import java.time.chrono.MinguoDate;
import java.util.Arrays;

public class ArrayList implements List{
	private int counter;
	private int length = 10;
	private String[] db;

	@Override
	public void add(String item) {
		if(counter == 0){
			db = new String[length];
		}

		if(length == counter){
			increaseSize();
		}
		db[counter] = item;
		counter++;

	}

	@Override
	public void add(int index, String item) {
		db = new String[length];
		db[index] = item;
	}

	@Override
	public String get(int index) {
		return db[index];
	}

	@Override
	public void remove(String item) {
		db[counter] = item;
		counter--;

	}

	@Override
	public void remove(int index) {
		counter--;

	}

	@Override
	public int size() {
		return counter;
	}

	@Override
	public void increaseSize() {
		length = length * 2;
		String[] db1 = new String[length];
		for(int i = 0; i < counter; i++){
			db1[i] = db[i];
		}
		db = db1;
	}
}
