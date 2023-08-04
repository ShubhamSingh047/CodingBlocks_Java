package StackAndQueue;

public class Queue {
	int front, rear, size; 
	int capacity; 
	int array[]; 

	public Queue(int capacity) 
	{ 
		this.capacity = capacity; 
		front = size = 0; 
		rear = capacity - 1; 
		array = new int[capacity]; 
	} 

	
	boolean isFull(Queue queue) 
	{ 
		return (size == capacity); 
	} 

	
	boolean isEmpty(Queue queue) 
	{ 
		return (queue.size == 0); 
	} 

	
	void enqueue(int item) 
	{ 
		if (isFull(this)) 
			return; 
		rear = (rear + 1) 
					% capacity; 
		array[rear] = item; 
		size = size + 1; 
		System.out.println(item 
						+ " enqueued to queue"); 
	} 

	
	int dequeue() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		int item = array[front]; 
		front = (front + 1) 
					% capacity; 
		size = size - 1; 
		return item; 
	} 

	
	int front() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		return array[front]; 
	} 

	
	int rear() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		return array[rear]; 
	} 
}
