package chapterSeven;

public class SevenPoint_OneOne {
	public static void main(String[] args) {
		int[] arrays = new int[20];
		for (int i = arrays.length-1; i >= 10 ; i--) {
			arrays[i] = arrays[i];
			System.out.println(arrays[i]);
		}
	}
}
