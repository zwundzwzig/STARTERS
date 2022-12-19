package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	
	private int number;

	public Task(int number) {
		this.number = number;
	}
	
	public void run() {
		System.out.printf("\nTask %d Started", number).println();
		
		for(int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " : ");
		}
		
		System.out.printf("Task %d Done.", number).println();
	}
	
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
//		ExecutorService excutorService = Executors.newSingleThreadExecutor();
		ExecutorService oldExcutorService = Executors.newFixedThreadPool(2);
		oldExcutorService.execute(new Task1());
		oldExcutorService.execute(new Thread(new Task2()));
		
		ExecutorService excutorService = Executors.newFixedThreadPool(2);
		excutorService.execute(new Task(1));
		excutorService.execute(new Task(2));

		System.out.println("\nTask3 : \n");
		System.out.println("\nTask3 Started\n");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " : ");
		}
		System.out.println("\nTask3 Done\n");
		System.out.println("\nMain Done\n");

		excutorService.shutdown();
	}

}
