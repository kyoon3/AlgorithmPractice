package crackingTheCodingInterview.arrayAndString;

import java.util.*;

public class Problem1by1 {
	public static boolean checkDuplicate(String word){
			Map<String, Integer> wordMap = new HashMap<String, Integer>();
			boolean answer = false;
			for(String letter: word.split("")){
				letter = letter.toLowerCase();
				if(wordMap.get(letter) != null){ // if there is a duplicate in the hashMap
					answer = true;
					break;
				}
			}
			return answer;
	}
	public static boolean checkDuplicateWithoutDataStructure(String word){
		boolean alphabetArray[] = new boolean[26];
		for(boolean alphabet: alphabetArray)
			alphabet = false;
		boolean answer = false;
		for(String letter: word.split("")){
			char alphabet = letter.toLowerCase().charAt(0);
			int location = alphabet - 'a';
			if(alphabetArray[location] != false){ // if there is a duplicate in the hashMap
				answer = true;
				break;
			}
			alphabetArray[location] = true;
		}
		return answer;
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		if (word.length() == 0) {
			System.out.println("Wrong word length. Word length should be bigger than 0");
			return;
		} // check for input
		boolean answer = false;
		answer = checkDuplicate(word);
		System.out.println(answer);
	}
}
