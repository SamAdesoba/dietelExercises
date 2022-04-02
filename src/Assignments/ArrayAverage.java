package Assignments;

public class ArrayAverage {
	static int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	static double sum = 0;


	public static void main(String[] args) {
		breakfast();
	}

	private static void breakfast() {
		fillArray();
		printArray();
		getMax();
		sumOfArray();
		averageOfArrays();
		System.out.println();

	}

	private static double averageOfArrays() {
		double average = sum/arrays.length;
		System.out.println("The average of the arrays is "+average);
		return average;
	}

	public static double sumOfArray() {
		for(int i=1;i < arrays.length;i++){
			sum = sum + arrays[i];
			}
		System.out.println("The sum of the arrays is "+sum);
		return sum;
	}

	private static int getMax() {
		int maxValue = arrays[0];
		for(int i=1;i < arrays.length;i++){
			if(arrays[i] > maxValue){
				maxValue = arrays[i];
			}
		}
		System.out.println("Th maximum value is "+maxValue);
		return maxValue;

	}


	public static void printArray() {
		for (int i = 0 ; i < 10; i++) {
			int arrayPrint =arrays[i];
			System.out.print(arrayPrint+" ");
		}
		System.out.println();
	}


	public static void fillArray() {
		for (int i = 0; i < 10; i++) {
			arrays[i] = i + 1;
		}
	}



}
