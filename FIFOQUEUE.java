// First In First Out queue

public class FIFOQUEUE {
	private static int front, rear, capacity; 
    private static int queue[]; 
   
    FIFOQUEUE(int size) { 
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
   
        // shift elements to the right by one place uptil rear 
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
   
       
      // set queue[rear] to 0
            if (rear < capacity) 
                queue[rear] = 0; 
   
            // decrement rear 
            rear--; 
        } 
        return; 
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
   
    // print elements in queue 
    static void size() {
    	return queue.length;
}
}
