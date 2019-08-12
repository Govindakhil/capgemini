package capgemini.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Execute_Test_5 {
	public static void main(String[] args) 	throws InterruptedException,ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Callable<String>	callable= new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("Entered Callable");
				Thread.sleep(2000);
				return "Task is Done!";
			}
		};
		
		System.out.println("Submitting Callable");
		Future<String> future = executorService.submit(callable);
		
		//This line executes immediately
		System.out.println("Do something else while callable is getting "+"executed");
		System.out.println("Retrieve the result of the future");
		//Future.get() blocks until the result is available
		String result = future.get();
		System.out.println(result);
		
		executorService.shutdown();
	}

}
