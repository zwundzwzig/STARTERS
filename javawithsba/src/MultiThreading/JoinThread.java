package MultiThreading;

class JoinThreadSub extends Thread {
	int i = 1;

	public void run() {
		i = 10;
		System.out.println("In run method : " + i);
	}
}

public class JoinThread {

	public static void main(String[] args) {
		JoinThreadSub t = new JoinThreadSub();
		t.start();

		try {
			System.out.println("Before join : " + t.i);
			t.join();
		}
		catch (Exception err) {
			err.printStackTrace();
		}

		System.out.println("In main method : " + t.i);
		System.out.println();
	}

}
