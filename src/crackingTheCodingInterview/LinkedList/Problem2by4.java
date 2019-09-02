package crackingTheCodingInterview.LinkedList;

import crackingTheCodingInterview.DataStructure.*;
public class Problem2by4{
	public LinkedList<Integer> DivisionByNodeData(Node<Integer> head,Integer n){
		Node<Integer> temp = head;
		LinkedList<Integer> SmallerThanN = new LinkedList<Integer>();
		LinkedList<Integer> BiggerThanN = new LinkedList<Integer>();
		if(temp.data >= n){
			BiggerThanN.add(temp.data);
		}
		else{
			SmallerThanN.add(temp.data);
		}
		Node<Integer> EndAtSmaller = null;
		while(temp.next != null){
			if(temp.next.data >= n){
				BiggerThanN.add(temp.next.data);
			}
			else{
				SmallerThanN.add(temp.next.data);
				EndAtSmaller = temp.next;
			}
			temp = temp.next;
		}
		if(EndAtSmaller != null){
			EndAtSmaller.next = BiggerThanN.head;
		}
		return SmallerThanN;
	
	}
	
}
