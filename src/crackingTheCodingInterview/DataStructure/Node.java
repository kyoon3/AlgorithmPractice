package crackingTheCodingInterview.DataStructure;


public class Node<T>{
		public Node<T> next;
		public T data;
		public Node<T> prev;
		public Node(T data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
}

