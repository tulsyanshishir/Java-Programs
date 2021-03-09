
public class intersectionOfLinkedList {
	
	public static Node intersectionNode(Node node1, Node node2) {
		if(node1==null || node2==null) return null;
		Result result1 = getTailAndSize(node1);
		Result result2 = getTailAndSize(node2);
		
		if(result1.tail!=result2.tail) return null;
		
		Node longer = result1.size<result2.size?node2:node1;
		Node shorter = result1.size<result2.size?node1:node2;
		
		longer = getKthNode(longer,Math.abs(result1.size-result2.size));
		while(longer!=shorter) {
			longer=longer.next;
			shorter=shorter.next;
		}
		return shorter;
	}
	
	public static Node getKthNode(Node node,int k) {
		if(node==null) return null;
		Node current  = node;
		while (k > 0 && current != null) {
			current=current.next;
			k--;
		}
		return current;
	}
	public static Result getTailAndSize(Node node) {
		if(node == null) {
			return null;
		}
		int size = 1;
		Node current=node;
		while(current.next!=null) {
			current = current.next;
			size=size+1;
		}
		
		return new Result(current,size);
	}
	
	public static class Result{
		private Node tail;
		private int size;
		
		public Result(Node tail, int size) {
			this.tail = tail;
			this.size = size;
		}

	}

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		
		list1.insert(10);
		list1.insert(9);
		list1.insert(8);
		list1.insert(7);
		list1.insert(6);
		list1.insert(5);
		
		LinkedList list2 = new LinkedList();
		
		list2.insert(11);
		list2.insert(12);
		
		Node list1P = list1.head;
		Node list2P = list2.head;
		
		list2P.next.next = list1P.next.next.next;
		
		Node intersection = intersectionNode(list1P, list2P);
		
		System.out.println(intersection.data);
		System.out.println(intersection.next);
		

	}

}
