
public class QueueOperation {

	public static void main(String[] args) {
		Queue queue = new Queue(10);
		int val;
	    val = queue.dequeue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.enqueue(90);
		queue.enqueue(100);
		
		val = queue.dequeue();
		System.out.println("Item: " + val + " dequeued");
		
		queue.enqueue(110);
		queue.enqueue(120);

		System.out.println(queue.front);
		System.out.println(queue.rear);
	}

}
