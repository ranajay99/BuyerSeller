Description of the given assignment


///////////////////////
public class Queue<V> implements QueueInterface<V>
{	
    public Queue(int capacity) 
    {
	//constructor to initialise the queue ds    	
   
    }

    public int size() 
    {
	//returns current number of elements in the queue
    
    }

    public boolean isEmpty()
    {
    	//checks if the queue is empty
    
    }
	
    public boolean isFull() 
    {
    	//checks if queue is full
    
    }

    public void enqueue(Node<V> node) 
    {
    	//adds one element to the rear
    }

    public NodeBase<V> dequeue() 
    {
	//removes one element from front   	
    	
    }
/////////////////////////////
public class PriorityQueue<V> implements QueueInterface<V>
    public PriorityQueue(int capacity)
    {
	//initializes the ds
    }

    public int size() 
    {
	//returns the number of elements currently present
    
    }

    public boolean isEmpty() 
    {
	//checks if the queue is empty
    }
	
    public boolean isFull() 
    {
	//checks if the queue is full
    }

    public void enqueue(Node<V> node) 
    {
    	//adds element to the rear
    }
    public NodeBase<V> dequeue() 
    { 
	//removes the element with highest priority
    }
    
}
/////////////////////
class Seller
{
    public void sell()
	{
		//waits till there is some space in the catalog
		//then adds the front element of inventory to the catalog
	}
}
/////////////////////
class Buyer
{
     public void buy()
	{
		//waits until there is some item in catalog
		//then removes the item with max priority
	}
	
}
//////////////////////
