package EhisClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "BOB, LOVES-Coding";
		String[] chars = s.split("[^a-zA-Z\\d]+");

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			String word = chars[i];
			if(i==0){
				stringBuilder.append(word.toLowerCase());
			}else{
				char firstChar = word.charAt(0);
				String wordWithFirstCharacterCapitalised = word.replace(firstChar, Character.toUpperCase(firstChar));
				String wordWithFirstCharacterCapitalisedAllOtherLettersToLowerCase = wordWithFirstCharacterCapitalised.toLowerCase();
//				stringBuilder
			}



		}
	}

}

