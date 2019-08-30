package crackingTheCodingInterview.arrayAndString;

import java.util.*;

public class Problem1by6 {
	public String CompressWord(String Word) {
		char Current = '?';
		int num = 1;
		boolean isOne = true;
		StringBuilder CompressedWord = new StringBuilder();
		for (char alpha : Word.toCharArray()) {
			if (Character.isAlphabetic(alpha) == false) {
				System.out.println("Word Contains Non-Alphabet");
				return null;
			}
			if (Current == '?') {
				Current = alpha;
			} else if (alpha != Current) {
				if (num != 1) {
					isOne = false;
				}
				CompressedWord.append(Current);
				CompressedWord.append(num);
				Current = alpha;
				num = 1;
			} else {
				num++;
			}
		}
		if (num != 1) {
			isOne = false;
		}
		CompressedWord.append(Current);
		CompressedWord.append(num);
		if (isOne == true)
			return Word;
		else
			return CompressedWord.toString();
	}
}