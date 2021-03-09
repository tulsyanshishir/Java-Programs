import java.util.ArrayList;

public class isLinkedListPalindrome {
	public static ArrayList<Integer> al = new ArrayList<Integer>();
	public static boolean palindrome = true;
	public static int count = 0;
	public static Node save;
	public static boolean isPalindrome(Node head) {
		if(head == null ) return false;
		if(count == 0 ) {
		 save = head;
		}
		count = count + 1;
		
		/*
		 * al.add(head.data); count = count + 1;
		 */
		isPalindrome(head.next);
		if(save.data != head.data) {
			palindrome = false;
		}
		save = save.next;
		
		return palindrome;
		 	
	}

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insert(3);
		l1.insert(4);
		l1.insert(1);
		l1.insert(2);
		l1.insert(1);
		l1.insert(4);
		l1.insert(3);
		
		boolean isPalin = isPalindrome(l1.head);
		System.out.println(isPalin);
		
	}

}
