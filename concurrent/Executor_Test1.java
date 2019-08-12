package capgemini.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Test1 {
	public static void main(String[] args) {
		System.out.println("Inside : "+Thread.currentThread().getName());
		System.out.println("creating Executor Services with single worker thread.");
		//Executor executor = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		System.out.println("Creating a Runnable....");
		Runnable task = new Runnable(){
			@Override
			public void run() {
				System.out.println("Inside : "+Thread.currentThread().getName());
			}
		};
		System.out.println("Submit the task specified by the runnable to the executor");
		//executor.execute(task);
		executorService.submit(task);
		
		System.out.println("Shutting down the executor");
		executorService.shutdown();
		
	}

}
