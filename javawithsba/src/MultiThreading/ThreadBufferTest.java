package MultiThreading;

class Buffer extends Thread {
	int value;
	boolean available = false;
	
	synchronized int getValue() {
		while(available == false) {
			try {
				wait();
			}
			catch(InterruptedException err) {
				err.printStackTrace();
			}
		}
		System.out.println("VALUE : " + value);
		available = false;
		notify();
		return value;
		
	};
	
	synchronized void setValue(int value) {
		while(available == true) {
			try {
				wait();
			}
			catch(InterruptedException err) {
				err.printStackTrace();
			}
		}
		this.value = value;
		System.out.println("SAVE : " + value);
		available = true;
		notify();
	};
}

class Producer extends Thread {
	
	Buffer buffer;
	
	Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i = 0; i <= 10; i++) {
			buffer.setValue(i);
		}
	}
	
}

class Consumer extends Thread {
	Buffer buffer;
	
	Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i = 0; i <= 10; i++) {
			buffer.getValue();
		}
	}
}

public class ThreadBufferTest {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Producer pd = new Producer(buffer);
		Consumer cs = new Consumer(buffer);
		
		pd.start();
		cs.start();
	}

}
