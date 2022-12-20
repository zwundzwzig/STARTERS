package MultiThreading;

class ThreadEx extends Thread {
	public void run() {
		System.out.println();
		for(int i = 0; i < 10000; i++) System.out.printf("%s", new String(")"));
		System.out.println();
		System.out.println("소요 시간 4 : " + (System.currentTimeMillis() - CurrentTimeMillsThread.startTime));
		System.out.println();
	}
}

public class CurrentTimeMillsThread {
	
	public static long startTime = 0;

	public static void main(String[] args) {
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) System.out.printf("%s", new String("-"));
		System.out.println();
		System.out.println("소요시간 1 : " + (System.currentTimeMillis() - startTime));
		System.out.println();

		for(int i = 0; i < 10000; i++) System.out.printf("%s", new String("|"));
		System.out.println();
		System.out.println("소요시간 2 : " + (System.currentTimeMillis() - startTime));
		System.out.println();
		Multiple();
	}
	
	public static void Multiple() {
		startTime = System.currentTimeMillis();
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		System.out.println();
		for(int i = 0; i < 10000; i++) System.out.printf("%s", new String("<"));
		System.out.println();
		System.out.println("소요 시간 3 : " + (System.currentTimeMillis() - startTime));
		System.out.println();
	}

}
