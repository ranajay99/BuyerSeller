
public class PriorityQueue<V> implements QueueInterface<V>{

    private NodeBase<V>[] queue;
    private int capacity, currentSize;
	
    //TODO Complete the Priority Queue implementation
    // You may create other member variables/ methods if required.
    public PriorityQueue(int capacity) { 
    	this.capacity=capacity;
    	currentSize=0;
    	queue=new Node[capacity];
    
    }

    public int size() {
    	return currentSize;
    
    }

    public boolean isEmpty() {
    	if(currentSize==0)
    		return true;
    	return false;

    }
	
    public boolean isFull() {
    	if(currentSize==capacity)
    		return true;
    	return false;

    }

    public void enqueue(Node<V> node) {
    	if(isFull())//|| node==null)
	    	return;
    	queue[currentSize++]=node;
    	//System.out.println("added "+currentSize);
    	
    }

    // In case of priority queue, the dequeue() should 
    // always remove the element with minimum priority value
    public NodeBase<V> dequeue() {
    	if(isEmpty())
	    	return null;
    	NodeBase<V> temp=queue[0];
    	int tempindex=0;
    	for(int i=1;i<currentSize;i++)
    	{
    		if(queue[i].priority<temp.priority)
    		{
    			tempindex=i;
    			temp=queue[i];
    		}
    	}
    	queue[tempindex]=null;
    	for(int i=tempindex;i<currentSize-1;i++)
    	{
    		queue[i]=queue[i+1];
    	}
    	currentSize--;
    	//System.out.println("deleted "+currentSize);
    	return temp;

    }

    public void display () {
	if (this.isEmpty()) {
            System.out.println("Queue is empty");
	}
	for(int i=0; i<currentSize; i++) {
            queue[i+1].show();
	}
    }
    
    public void add(int priority,V data)
    {
    	Node<V> n=new Node<V>(priority,data);
    	enqueue(n);
    }
    
    public NodeBase<V> removeMin()
    {
    	return dequeue();
    }
}

