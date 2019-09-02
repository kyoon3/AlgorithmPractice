package crackingTheCodingInterview.LinkedList;

import java.util.*;
import crackingTheCodingInterview.DataStructure.*;

public class Problem2by1 {
	public void delDuplicate(Node<String> head) {
		Map<String, Integer> CheckDuplicateMap = new HashMap<String, Integer>();
		Node<String> n = head;
		if (n == null) {
			System.out.println("error");
			return;
		}
		String cur = head.data;
		CheckDuplicateMap.put(cur, 0);
		while (n.next != null) {
			cur = n.next.data;
			if (CheckDuplicateMap.get(cur) == null) {
				CheckDuplicateMap.put(cur, 0);
			} else {
				n.next = n.next.next;
			}
			if (n.next != null)
				n = n.next;
		}
	}

	public void delDuplicateWithoutBuffer(Node<String> head) {
		Node<String> n = head;
		if (n == null) {
			System.out.println("error");
			return;
		}
		String cur = head.data;
		while (n.next != null) {
			Node<String> temp = n;
			cur = temp.data;
			{
				while (temp.next != null) {
					if (temp.next.data.equals(cur)) {
						temp.next = temp.next.next;
					}
					if (temp.next != null) {
						temp = temp.next;
					}
				}
			}
			if (n.next != null) {
				n = n.next;
			}

		}
	}
}
