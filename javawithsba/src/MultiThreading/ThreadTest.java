package MultiThreading;

class MyThread1 extends Thread {
	public void run() {
		for(int i = 1; i < 50; i++) System.out.println(i + " : 1");
	}
}

class MyThread2 implements Runnable {
	public void run() {
		for(int i = 1; i < 50; i++) System.out.println(i + " : 2");
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
		Thread m3 = new Thread();
		m1.run();
		m2.run();
		m3.run();
		
	}

}
