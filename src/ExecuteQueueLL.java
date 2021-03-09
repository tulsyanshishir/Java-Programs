
public class ExecuteQueueLL {

	public static void main(String[] args) {
		QueueLinkedList qll = new QueueLinkedList();
		//ExecuteQueueLL ex = new ExecuteQueueLL();
		qll.enqueue(10);
		qll.enqueue(20);
		qll.enqueue(30);
		//ex.traverseQueue(qll);
		int val = qll.dequeue(qll.front,qll.rear);
		System.out.println(val);
		val = qll.dequeue(qll.front,qll.rear);
		System.out.println(val);
		val = qll.dequeue(qll.front,qll.rear);
		System.out.println(val);
		val = qll.dequeue(qll.front,qll.rear);
		System.out.println(val);
	}
	
	public void traverseQueue(QueueLinkedList qll) {
		while(qll.front != null) {
			System.out.println(qll.front.data);
			qll.front = qll.front.next;
		}
	}

}
