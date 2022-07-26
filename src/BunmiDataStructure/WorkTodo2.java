package BunmiDataStructure;


import java.security.SecureRandom;

public class WorkTodo2 {

	public static void main(String[] args) {
		int[] numbers = {1,2,5,7,2};
		int[] sum = sumOfElement(numbers,70);
		for (int num: sum) {
			System.out.print(num + " ");
		}
	}
//	public static void distribute(int[] chocolates){
//		for (int i = 0; i < chocolates.length; i++) {
//			System.out.println("for item " + (i+1));
//			for (int j = 0; j < chocolates[i]; j++) {
////				SecureRandom random = new SecureRandom(chocolates[i]-j);
//				System.out.println("Student " + (j+1) + " takes " + (j+1 ) );
//			}
//
//		}
//	}

	public static void sortZeros(int[] num){

		for (int i = 0; i < num.length-1; i++) {
			int temp = num[i];
			if( num[i] > 0 && num[i] > num[i+1]){
			num[i] = num[i+1];
			num[i+1] = temp;
			}
		}
	}

	public static void sendZerosToTheBack(int[] num){

		for (int i = num.length-1; i >= 0; i--) {
			int temp = num[i-1];
			if( num[i] > 0){
				num[i-1] = num[i];
				num[i] = temp;
			}
		}
	}

	public static int[] sumOfElement(int[] num, int target){
		int[] index = new int[2];
		for (int i = num.length-1; i >= 0; i--) {
			for (int j = 0; j < num.length-1; j++) {
				if( num[i] + num[j] == target){
					index[0] = i;
					index[1] = j;
			}
			}
		}
		return index;
	}


}
