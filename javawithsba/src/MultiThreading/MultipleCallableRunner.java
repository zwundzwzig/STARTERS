package MultiThreading;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		List<CallableStack> tasks = List.of(
			new CallableStack("Sessac"), 
			new CallableStack("cho"), 
			new CallableStack("Jun")
		);
		List<Future<String>> results = executorService.invokeAll(tasks);
//		Future<String> welcomeFuture = executorService.submit(new CallableStack("JavaScript"));
		
		for(Future<String> result : results) {
			System.out.println(result.get());
		}
		
		executorService.shutdown();
	}

}
