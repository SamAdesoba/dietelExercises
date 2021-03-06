package DataStructureAndAlgorithm;


import Exercises.ArrayList;

public class MySet {
	ArrayList arrayList = new ArrayList();


	public void add(String element) {
		if(!contains(element)) arrayList.add(element);

	}

	public int size() {
		return arrayList.size();
	}

	public int get(int index) {
		return Integer.parseInt(arrayList.get(index));
	}

	public boolean contains(String element){
		for (int i = 0; i < size(); i++) {
			if (arrayList.get(i).equals(element))return true;
			}
			return false;
	}

	public void remove(String element) {
		arrayList.remove(element);
	}

	public void removeAll() {
		arrayList.removeAll();
	}
}
