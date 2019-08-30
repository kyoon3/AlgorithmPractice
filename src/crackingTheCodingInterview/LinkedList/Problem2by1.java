package crackingTheCodingInterview.LinkedList;

import java.util.*;
import crackingTheCodingInterview.DataStructure.*;
public class Problem2by1 {
	public void delDuplicate(Node<Integer> head){
		Map<Integer, Integer> CheckDuplicateMap = new HashMap<Integer,Integer>();
		Integer cur = head.data;
		Node<Integer> n = head;
		if(n == null){
			System.out.println("error");
		}
		CheckDuplicateMap.put(cur,cur);
		while(n.next != null){
			cur = head.next.data;
			if(CheckDuplicateMap.get(cur)!=null){
				head.next = head.next.next;
			}
			n = n.next;
		}
	}
}
