import java.util.*;

//  Definition for singly-linked list.

 
public class MergeKList {
    private  static Node mergeKLists(Node[] lists) {
        
    	PriorityQueue<Node> q = new PriorityQueue<Node>((o1,o2)->o1.data-o2.data);
        for(Node ln : lists)
            if(ln!=null)
                q.add(ln);
        
        Node head = new Node(0);
        Node runner = head;
        while(!q.isEmpty()){
            runner.next = q.poll();
            runner = runner.next;
            Node next = runner.next;
            if(next!=null)
                q.add(next);
        }        return head.next;
    }    
   
    public static void main(String[] args) {
    	LinkedList l1 = new LinkedList();
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		
		LinkedList l2 = new LinkedList();
		l2.insert(5);
		l2.insert(6);
		l2.insert(9);
		
		LinkedList l3 = new LinkedList();
		l3.insert(1);
		l3.insert(2);
		l3.insert(6);
		
		Node[] n1 = {l1.head,l2.head,l3.head};
		
		Node r = mergeKLists(n1);
		
		while(r!=null) {
			System.out.println(r.data);
			r = r.next;
		}
    }

	
}