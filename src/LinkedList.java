
public class LinkedList {

	Node head = null;
	Node rear = null;
	
	public  void insert(int val) {
		if (head == null) 
			head = new Node(val);
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = new Node(val);
			rear = n.next;
		}
	}
}
