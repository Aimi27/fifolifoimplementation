// Last In First Out queue

public class LIFOQUEUE {
	private static int front, rear, capacity; 
    private static int queue[]; 
   
    LIFOQUEUE(int size) { 
        front = rear = 0; 
        capacity = size; 
        queue = new int[capacity]; 
    } 
   
    // enqueue item
    static void enqueue(int item)  { 
        // check if the queue is full
        if (capacity == rear) { 
            System.out.printf("\nQueue is full\n"); 
            return; 
        } 
   
        // insert element at the rear 
        else { 
            queue[rear] = item; 
            rear++; 
        } 
        return; 
    } 
   
    //remove an element from the queue
    static void dequeue()  { 
        // check if queue is empty 
        if (front == rear) { 
            System.out.printf("\nQueue is empty\n"); 
            return; 
        } 
   
       
      // remove last item in queue
            if (rear < capacity) 
                queue[rear] = 0; 
   
            // increment rear 
            rear++; 
        } 
    } 
   
    // print queue elements 
    static void getQueue() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
   
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf(" %d = ", queue[i]); 
        } 
        return; 
    } 
   
    // print no of elements in queue
    static void size() {
    	return queue.length;
}
}
