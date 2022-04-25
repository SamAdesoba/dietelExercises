package Assignments;

public class SevenSegmentDisplay {
	private static int[][] arrays = new int[5][3];
	public static void main(String[] args) {
		createDisplayArray();
		segmentString("000000");
	}

	private static void segmentString(String digits) {
		if (digits.charAt(0) == '1') {
			for (int i = 0; i < 3; i++) {
				arrays[0][i] = 1;
			}
		}
	}

	private static void createDisplayArray() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				arrays[i][j] = 0;
				System.out.print(arrays[i][j]+" ");
			}
			System.out.println();
		}
	}
}
