package capgemini.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor_Test2 {
	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());
		System.out.println("creating Executor Services with single worker thread.");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//ExecutorService executorService = Executors.newFixedThreadPool(2);

		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside : " + Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException ex) {
					throw new IllegalStateException(ex);
				}
			}
		};
		
		Runnable task2 = new Runnable() {
			public void run() {
				System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(4);
				} catch (InterruptedException ex) {
					throw new IllegalStateException(ex);
				}
			}
		};
		
		Runnable task3 = new Runnable() {
			public void run() {
				System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException ex) {
					throw new IllegalStateException(ex);
				}
			}
		};

		System.out.println("Submitting the tasks for execution...");
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);

		System.out.println("Shutting down the executor");
		executorService.shutdown();

	}

}
