package DataStructureAndAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashMap {
	private int counter;
	private LinkedList<String> arrays = new LinkedList<>();

	private ArrayList<String> keys = new ArrayList<>(5);
	private ArrayList<String> values = new ArrayList<>(5);
//	private String value;

	public boolean isEmpty() {
		if (counter > 0) return false;
		return true;
	}

	public void add(String key, String value) {
			keys.add(counter, key);
			values.add(counter, value);
		counter++;
	}

	public int size() {
		return counter;
	}


	public String getValue(String key) {
		for (int i = 0; i < keys.size(); i++) {
			if (key.equals(keys.get(i))) return values.get(i);
		}
		return null;
	}


	public String getKey(String Value) {
		for (int i = 0; i < values.size(); i++) {
			if (Value.equals(values.get(i))) return keys.get(i);
		}
		return null;
	}

	public void replace(String key, String value) {
		for (int i = 0; i < keys.size(); i++) {
			if (key.equals(keys.get(i))) {
				values.add(i, value);

			}
		}
	}

	public void remove(int index) {
		keys.remove(index);
		values.remove(index);
		counter--;
	}
}
