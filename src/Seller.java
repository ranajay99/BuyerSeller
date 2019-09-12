import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Seller<V> extends SellerBase<V> {
	
    public Seller (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, Queue<V> inventory) {
        //TODO Complete the constructor method by initializing the attibutes
        // ...
    	setSleepTime(sleepTime);
    	this.lock=lock;
    	this.full=full;
    	this.empty=empty;
    	this.catalog=catalog;
    	this.inventory=inventory;
    	
    }
    
    public void sell() throws InterruptedException {
	try {
            //TODO Complete the try block for produce method
            // ...
		//synchronized(catalog) {
			lock.lock();
			Node<V> n = null;
			while(catalog.isFull())
				full.await();
			
			if(inventory.isEmpty())
				return;
			n=(Node<V>)inventory.dequeue();
			catalog.enqueue(n);	
		//}
			
	} catch(Exception e) {
            e.printStackTrace();
	} finally {
            //TODO Complete this block
			empty.signal();
			lock.unlock();
	}		
    }
}
