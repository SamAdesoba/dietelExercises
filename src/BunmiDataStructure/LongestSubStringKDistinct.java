package BunmiDataStructure;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringKDistinct {
	public static void main(String[] args) {
		System.out.println(findLength("adesobaadefolarin", 3));;
	}


	public static int findLength(String str, int k) {
		int windowStart = 0, maxLength = 0;
		Map<Character, Integer> charFrequencyMap = new HashMap<>();
		for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
			char rightChar = str.charAt(windowEnd);
			charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

			while (charFrequencyMap.size() > k) {
				char leftChar = str.charAt(windowStart);
				charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
				if (charFrequencyMap.get(leftChar) == 0) {
					charFrequencyMap.remove(leftChar);
				}
				windowStart++;
			}
			maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
		}
		return maxLength;
	}
}
