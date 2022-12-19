package MultiThreading;

class Task1 extends Thread {
	public void run() { //signature
		System.out.println("\nTask1 Started\n");
		
		for(int i = 101; i <= 199; i++) {
			System.out.print(i + " : ");
		}
		
		System.out.println("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask2 Started\n");
		
		for(int i = 201; i <= 299; i++) {
			System.out.print(i + " : ");
		}
		
		System.out.println("\nTask2 Done\n");
	}
	
}

public class ThreadKickOffTest {
	// new - 스레드 생성, start 직전
	// runnable - start 됐지만 현재 실행되진 않는 스레드
	// running - start 됐고 현재 실행되는 스레드
	// blocked/waiting - 외부 인터페이스나 DB에 의해 사용자의 접근이 차단된 스레드
	// terminated/dead - 실행이 완료된 스레드

	public static void main(String[] args) throws InterruptedException {
		Task1 task1 = new Task1();
		task1.setPriority(1);
		System.out.println("\nTask1 : \n");
		task1.start();
		task1.join();
		
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(2);
		System.out.println("\nTask2 : \n");
		task2Thread.start();
		task2Thread.join();
		
		System.out.println("\nTask3 : \n");
		System.out.println("\nTask3 Started\n");
		for(int i =301; i <= 399; i++) {
			System.out.print(i + " : ");
		}
		System.out.println("\nTask3 Done\n");
		System.out.println("\nMain Done\n");
	}

}
