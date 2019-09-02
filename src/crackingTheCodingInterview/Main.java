package crackingTheCodingInterview;

import crackingTheCodingInterview.arrayAndString.*;
import crackingTheCodingInterview.LinkedList.*;
import crackingTheCodingInterview.DataStructure.*;

public class Main {
	public static void main(String[] args) {
		Problem1by6 p1by6 = new Problem1by6();
		System.out.println(p1by6.CompressWord("abcall@#"));
		String example = "abcdec";
		Problem2by1 p2by1 = new Problem2by1();
		LinkedList<String> LL = new LinkedList<String>();
		for(String cur : example.split("")) {
			LL.add(cur);
		}
		Problem2by2 p2by2 = new Problem2by2();
		Problem2by3 p2by3 = new Problem2by3();

		LL.print();
		p2by3.DeleteSpecificNode(LL.head.next.next);
		LL.print();
		int[] examInteger = {3,5,8,5,10,2,1};
		
		LinkedList<Integer> LLI = new LinkedList<Integer>();
		for(Integer i : examInteger) {
			LLI.add(i);
		}
		Problem2by4 p2by4 = new Problem2by4();
		LLI = p2by4.DivisionByNodeData(LLI.head,5);
		LLI.print();

	}
}
