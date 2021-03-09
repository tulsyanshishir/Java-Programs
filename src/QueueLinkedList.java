
public class QueueLinkedList {
	
  LinkedList queue = new LinkedList();
  Node front = null;
  Node rear  = null;
  int size   = 0;
  
  void enqueue(int val) {
	  queue.insert(val);
	  if(front == null && rear == null) {
		  front = rear =  queue.head;		 
	  }
	  else {
		  rear = queue.rear;	
	  }
  }
  
  int dequeue(Node front,Node rear) {
	  if(this.front == null && this.rear == null) {
		  return Integer.MIN_VALUE;
	  }
	  int val = front.data;
	  if(front == rear) {
		  this.front = this.rear = null;
		  return val;
		  }
	  this.front = this.front.next;
	  return val;
  }
}
