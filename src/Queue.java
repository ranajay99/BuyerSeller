// This class implements the Queue
public class Queue<V> implements QueueInterface<V>{

    //TODO Complete the Queue implementation
    private NodeBase<V>[] queue;
    private int capacity, currentSize, front, rear;
	
    public Queue(int capacity) {  
    	this.capacity=capacity;
    	queue=new Node[capacity];
    	currentSize=0;
    	front=0;
    	rear=-1;
    
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
    	if(isFull())
    		return;
    	
    	queue[++rear]=node;
    	currentSize++;    		
    	
    
    }

    public NodeBase<V> dequeue() {
    	if(isEmpty())
    		return null;
    	NodeBase<V> temp=queue[front];
    	queue[front]=null;
    	for(int i=0;i<rear;i++)
    		queue[i]=queue[i+1];
    	queue[rear--]=null;
    	currentSize--;
    	//System.out.println("dequeue "+currentSize);
    	return temp;
    	
    	
    }

}

