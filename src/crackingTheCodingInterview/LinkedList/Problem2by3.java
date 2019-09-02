package crackingTheCodingInterview.LinkedList;

import crackingTheCodingInterview.DataStructure.Node;

public class Problem2by3 {
		public void DeleteSpecificNode(Node<String> n){
			Node<String> temp = n.next;
			n.data = temp.data;
			n.next = temp.next;
			n = null;
		
		}
		
	
}
