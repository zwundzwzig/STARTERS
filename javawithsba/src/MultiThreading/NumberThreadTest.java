package MultiThreading;

class NumThread extends Thread {

	NumThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 99; i++) {
			System.out.println(getName() + " : " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException err) {
			err.printStackTrace();
		}
	}
}

public class NumberThreadTest {

	public static void main(String[] args) {
		NumThread nt1 = new NumThread("JavaScript");
		NumThread nt2 = new NumThread("Node");
		nt1.start();
		nt2.start();

	}

}
