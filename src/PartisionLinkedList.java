
public class PartisionLinkedList {
	
	public static Node partition(Node node, int x) {
		/* Mark both head and tail as given node */
	    Node head = node;
		Node tail = node;
		/* Keep checking until node is null */
		while (node != null) {
			Node next = node.next;
			if (node.data < x) {
				/* If node is smaller then X, Insert at head */
				node.next = head;
				head = node;
			} else {
				/* If node is greater then X, Insert at tail */
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}
   public static void reversePrintLL(Node node) {
	   
	   if(node == null) return;
	   reversePrintLL(node.next);
	   System.out.println(node.data);
	   
   }
	public static void main(String[] args) {
		LinkedList nl = new LinkedList();
		nl.insert(5);
		nl.insert(6);
		nl.insert(2);
		nl.insert(4);
		nl.insert(1);
		nl.insert(8);
		nl.insert(10);
		nl.insert(2);
		nl.insert(7);
		
		Node revPrint = nl.head;
		
		reversePrintLL(revPrint);
		
		Node node = nl.head;
		
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.print(" ");
		node = nl.head;
		
		Node partitioned = partition(node,3);
		
		while(partitioned != null) {
			System.out.print(partitioned.data + " ");
			partitioned = partitioned.next;
		}

	}

}
