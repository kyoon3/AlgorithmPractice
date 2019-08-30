package crackingTheCodingInterview.DataStructure;

public class LinkedList<T>{
	Node<T> head = null;
	public void add(T data){
		Node<T> t = new Node<T>(data);
		if(head == null){
			head = t;
		}
		else{
			Node<T> n = head;
			while(n.next != null){
				n = n.next;
			}
			n.next = t;	
		}
	}
	public Node<T> delete(T data){

		Node<T> DeletedNode = null;
		if(head==null){
			//throw new EmptyLinkedListException(); 구현 안함.
		}
		if(head.data == data){
			head = head.next;
		}
		else{
			Node<T> n = head;
			while(n.next != null){
				if(n.next.data == data){
					DeletedNode = n.next;
					n.next = n.next.next;
					break;
				}
				n = n.next;
			}
			
		}
		return DeletedNode;
	}
}
