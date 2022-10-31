// IQueueable Interface

public class IQueuable {
	public static void main(String[] args) { 
        // Create a queue of capacity 4 
        FIFOQUEUE q = new FIFOQUEUE(4); 
   
        // inserting elements in the queue 
        FIFOQUEUE.enqueue(1); 
        FIFOQUEUE.enqueue(2); 
        FIFOQUEUE.enqueue(3); 
        FIFOQUEUE.enqueue(4); 
   
        // print Queue elements 
        System.out.println("Queue after Enqueue Operation:");
        FIFOQUEUE.getQueue();
   
        // dequeue items
        FIFOQUEUE.dequeue(); 
        FIFOQUEUE.dequeue(); 
        System.out.printf("\nQueue after two dequeue operations:"); 
   
        // print Queue elements 
        FIFOQUEUE.getQueue(); 
}
