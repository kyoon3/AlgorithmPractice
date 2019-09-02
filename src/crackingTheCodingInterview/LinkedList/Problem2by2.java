package crackingTheCodingInterview.LinkedList;

import java.util.*;
import crackingTheCodingInterview.DataStructure.*;
public class Problem2by2{
	public Node<String> FindBackKNode(Node<String> n, int k){
		int cur = 0;
		Node<String> temp = n;
		Boolean Possible = false;
		while(n.next!=null){
			n = n.next;
			if(cur >= k){
				Possible = true;
				temp = temp.next;		
			}
			cur++;

		}
		if(Possible == false){
			System.out.println("error");
			return null;
		}
		return temp;

	}

}