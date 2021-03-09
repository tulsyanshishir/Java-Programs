
public class ExecuteLinkedList {
 
	public static void main(String args[]) {
		Node node;
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		node = list.head;
		while(node != null) {
				System.out.println(node.data);
				node = node.next;
		}
		
	}
}
