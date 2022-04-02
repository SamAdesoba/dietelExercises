package practise;

import java.security.SecureRandom;

public class password {
	public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
			String password = randomString();
			System.out.print(password);
		}
		System.out.println();
		String[] arrays = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		for (int i = 0; i < 62; i++) {
			System.out.print(arrays[i]);
		}
		System.out.println();
		System.out.print(arrays[61]);

	}

	public static String randomString() {
		String[] arrays = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String string = getRandomString(arrays);
		return string;
	}

	public static String getRandomString(String[] arrays) {
		SecureRandom random = new SecureRandom();
		int rand = random.nextInt(arrays.length);
		return arrays[rand];
	}


}
