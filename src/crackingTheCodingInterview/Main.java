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

		LL.print();
		Node<String> ans = p2by2.FindBackKNode(LL.head,8);
		System.out.println(ans.data);
		LL.print();
		
	}
}
