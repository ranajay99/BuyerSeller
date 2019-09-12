import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Buyer<V> extends BuyerBase<V> {
    public Buyer (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, int iteration) {
        //TODO Complete the Buyer Constructor method
        // ...
    	setSleepTime(sleepTime);
    	this.lock=lock;
    	this.full=full;
    	this.empty=empty;
    	this.catalog=catalog;
    	setIteration(iteration);
    }
    public void buy() throws InterruptedException {
	try {
            //TODO Complete the try block for consume method
            // ...
		//synchronized(catalog) {
			lock.lock();
			NodeBase<V> n=null;
			while(catalog.isEmpty())
				empty.await();
			n=catalog.dequeue();
			System.out.print("Consumed "); // DO NOT REMOVE (For Automated Testing)
            n.show(); // DO NOT REMOVE (For Automated Testing)
            // ...
		//}
	} catch (Exception e) {
            e.printStackTrace();
	} finally {
            //TODO Complete this block
			full.signal();
			lock.unlock();
	}
    }
}
