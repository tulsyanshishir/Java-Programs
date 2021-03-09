
public class Queue {

	int queueArr[];
	int front,rear,size;
	int capacity;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		this.queueArr = new int[this.capacity];
		front = 0;
		rear  = this.capacity-1;
		size  =  0;
	}
	
	boolean isFull(Queue queue) {
		return(queue.capacity == queue.size);
			
	}
	boolean isEmpty(Queue queue) {
		return(queue.size == 0);
	}
	void enqueue(int item) {
		if(isFull(this)) {
			System.out.println("Queue is full, Item: " + item + " cannot be enqueued");
			return;}
		this.rear = (this.rear+1)%this.capacity;
		this.queueArr[this.rear] = item;
		this.size = this.size+1;
	}
	int dequeue() {
		if(isEmpty(this))
		{  System.out.println("Queuue is empty");
			return 0;}
		int item = this.queueArr[front];
		this.front = this.front + 1;
		this.size  = this.size - 1;
		return item;
	}
	int front() {
		if(isEmpty(this)) return 0;
		return this.queueArr[this.front];
	}
	int rear() {
		if(isEmpty(this)) return 0;
		return this.queueArr[this.rear];
	}
}
