
public class LinkedListAddition {
	static  int carry =0;
	public static Node findSum(Node l1, Node l2) {
		
		if(l1==null&&l2==null&&carry==0) return null;
		int value = carry;
		if(l1!=null) value = value + l1.data;
		if(l2!=null) value = value + l2.data;
		
		Node result= new Node(value%10);
		 carry = value/10;
		if (l1!=null || l2!=null) {
			Node nextNode = findSum(l1==null?null:l1.next,l2==null?null:l2.next);
			result.next = nextNode;
		}
		
		return result;
	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insert(3);
		l1.insert(4);
		l1.insert(1);
		
		LinkedList l2 = new LinkedList();
		l2.insert(5);
		l2.insert(6);
		l2.insert(9);
		
		Node sum = findSum(l1.head, l2.head);
		while(sum!=null) {
			System.out.println(sum.data);
			sum = sum.next;
		}

	}

}
