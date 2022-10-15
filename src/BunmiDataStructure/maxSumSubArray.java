package BunmiDataStructure;

public class maxSumSubArray {
	private static int findMaxSumSubArray(int[] arr, int k) {
		int max = Integer.MIN_VALUE;
		int currentMaxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			currentMaxSum += arr[i];
			if(i >= k - 1){
				max = Math.max(max, currentMaxSum);
				currentMaxSum -= arr[i - (k - 1)];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(findMaxSumSubArray(new int[] {4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 3));
	}
}
