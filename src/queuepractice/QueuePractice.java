
package queuepractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class QueuePractice<D> {

    LinkedList<D> queue;
    
    // Making a queue instance
    public QueuePractice() {
        queue = new LinkedList();
    }
    
    // Is the queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    // Return the size of our queue
    public int size() {
        return queue.size();
    }
    
    // Add something to the queue
    public void enqueue(D n) {
        queue.addLast(n);
    }
    
    // Remove next item in queue
    public D dequeue() {
        return queue.remove(0);
    }
    
    // Peek at next item
    public D peek() {
        return queue.get(0);
    }
    
    public static void main(String[] args) {
        Stack<String> stacker = new Stack<>();
        Queue queue = new LinkedList();
        
        stacker.push("there");
        stacker.push("hi");
        System.out.println("Size: " + stacker.size());
        System.out.println(stacker.pop() + " ");
        System.out.println("Peek: " + stacker.peek());
        System.out.println(stacker.pop() + "!");
        System.out.println("Size: " + stacker.size());
        
        queue.add("b");
        queue.remove();
        
        
        QueuePractice stringQueue = new QueuePractice();
        stringQueue.enqueue("Hi");
        stringQueue.enqueue("There");
        System.out.print(stringQueue.dequeue() + " ");
        System.out.print(stringQueue.dequeue() + ".");
        
        
        QueuePractice numberQueue = new QueuePractice();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Check second item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
        
    }
    
}
