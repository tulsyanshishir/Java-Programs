
public class loopInLinkedList {
    public static Boolean detectLoopAndResolve(Node node) {
    	Node slow = node;
    	Node fast = node;
    	Boolean loop = false;
    	while(slow!=null||fast!=null||fast.next!=null) {
    		slow=slow.next;
    		fast=fast.next.next;
    		if(slow==fast) {
    			loop = true;
    			break;
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
