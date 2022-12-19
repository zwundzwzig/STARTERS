package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableStack implements Callable<String> {

	private String name;
	
	public CallableStack(String name) {
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return ("Hello! " + name);
	}
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> newFuture = executorService.submit(new CallableStack("JavaScript"));
		
		System.out.println("\nnew CallableTask (\"Woongin ThinkBig\") executed");
		String welcomeMessage = newFuture.get();
		
		System.out.println(welcomeMessage);
		System.out.println("\nMain completed.");
	}

}
