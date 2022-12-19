package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	int i = 0;
	int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	synchronized public void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}
	
	public int getI() {
		return i;
	}
	
	synchronized public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}
	
	public int getJ() {
		return j;
	}

}
