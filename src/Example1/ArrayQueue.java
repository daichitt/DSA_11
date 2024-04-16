/**
 * Class ArrayQueue implements an array-based queue data structure. Each element of the queue is an integer.
 * Please refer to Lecture 7 for the array-based queue ADT in detail. 
 * @author (nxthang) 
 * @version (1.0)
 */
package Example1;
public class ArrayQueue
{
    private int[] items;
    private static final int maxSize=10000;
    private int front;
    private int rear;
    /**
     * Constructor for objects of class ArrayQueue.
     * This constructor creates an empty queue.
     */
    public ArrayQueue()
    {
        items = new int[maxSize]; //Create an array of maxSize elements
        front = 0; //Initialize front
        rear = -1; //Initialize rear
    }

    /**
     * This operation returns true if the queue is empty, otherwise it returns false
     */    
    public boolean isEmpty()
    {
        if(front>rear)
            return true;
        else
            return false;
    }
    
    /**
     * This operation returns true if the queue is full, otherwise it returns false
     */    
    public boolean isFull()
    {
        if(rear==maxSize-1)
            return true;
        else
            return false;
    }
    
    /**
     * This operation adds a newItem to the queue.
     */        
    public void enqueue(int newItem)
    {
        if(isFull())
            System.out.println("Queue is full");
        else
        {
            rear++; // move rear to the next position
            items[rear]=newItem; // add newItem to the rear position
        }

    }

    /**
     * This operation returns the item at the front position of the queue and deletes this item.
     */    
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            int item = items[front]; // get the item at the front position
            front++; // move front to the next position
            return item;
        }

    }
    
    /**
     * This operation returns an item at the front position of the queue. This item will not be deleted.
     */        
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            return items[front];
        }

    }
}