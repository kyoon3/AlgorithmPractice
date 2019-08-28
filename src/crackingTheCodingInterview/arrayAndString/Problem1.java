package crackingTheCodingInterview.arrayAndString;

import java.util.*;

public class Problem1 {
	public static boolean checkDuplicate(String word){
			Map<String, Integer> wordMap = new HashMap<String, Integer>();
			boolean answer = false;
			for(String letter: word.split("")){
				letter = letter.toLowerCase();
				if(wordMap.get(letter) != null){
					answer = true;
					break;
				}
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
