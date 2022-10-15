package HackerankSolutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
	static int result = 0;
	public static void main(String[] args) {
		String s = "2bbbb";
		int n = 5;
		int result = numberOfCharactersToBeAdded(s,n);
		System.out.println(result);
	}

	private static int numberOfCharactersToBeAdded(String s, int n) {


		Pattern digitPattern = Pattern.compile("\\d");
		Pattern upperPattern = Pattern.compile("[A-Z]");
		Pattern localPattern = Pattern.compile("[a-z]");
		Pattern specialPattern = Pattern.compile("\\W");

		Matcher digitMatcher = digitPattern.matcher(s);
		Matcher upperMatcher = upperPattern.matcher(s);
		Matcher localMatcher = localPattern.matcher(s);
		Matcher specialMatcher = specialPattern.matcher(s);


		if(digitMatcher.find()){
			result++;
			System.out.println(result);
		}
		if(!s.matches("[a-z]")){
			result++;
			System.out.println(result);
		}
		if(!s.matches("\\d")){
			result++;
			System.out.println(result);
		}

		if(!s.matches("[^a-zA-Z\\d]")){
			result++;
			System.out.println(result);
		}

		if((n + result ) < 6){
			result += 6 - (n + result );
		}
		return result;
	}
}
