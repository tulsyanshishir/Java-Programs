import java.util.HashSet;
import java.util.Set;

public class RemoveDupFromLinkedList {

	public static Node removeDuplicate(Node sanitize) {
		if (sanitize == null)
			return null;

		Node current = sanitize;
		Node previous = null;
		Set<Integer> store = new HashSet<>();
		while (current != null) {
			if (!store.contains(current.data)) {
				store.add(current.data);
				previous = current;
			} else {
				previous.next = current.next;
			}
			current = current.next;
		}

		return sanitize;
	}
	
	public static int kthLast(Node node , int k) {
		
		Node starter = node;
		Node kth     = node;
		int count    = 0;
		while(starter != null) {
				
			starter = starter.next;
			if (count >= k)
				kth = kth.next;
			count = count + 1;	
		}
		return kth.data;
		
	}
	
	public static void removeMiddle(Node node) {
		Node slow = node;
		Node fast = node;
		Node previous  = null;
		
		while(fast != null && fast.next != null) {
			previous = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
		previous.next = slow.next;
		
	}

	public static void main(String[] args) {
		LinkedList head = new LinkedList();
		head.insert(4);
		head.insert(5);
		head.insert(4);
		head.insert(6);
		head.insert(9);
		head.insert(5);
		head.insert(8);
		
		LinkedList test = new LinkedList();
		test.insert(9);
		test.insert(10);
		
		test.head.next = test.head;

		int elementK = kthLast(head.head, 2);
		System.out.println(elementK );
		
		removeMiddle(head.head);
	    
		Node cleaned = removeDuplicate(head.head);

		while(cleaned != null) {
			System.out.println(cleaned.data);
			cleaned = cleaned.next;
		}
		 

	}

}
