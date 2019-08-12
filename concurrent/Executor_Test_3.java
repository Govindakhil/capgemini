package capgemini.concurrent;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executor_Test_3 {
	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService =Executors.newScheduledThreadPool(1);
		
		Runnable task =new Runnable (){
			public void run(){
				System.out.println("Executing Task At "+System.nanoTime());
			}
		};
		
		System.out.println("Submitting task at "+ System.nanoTime() + " "+ "to be executed after 5 seconds.");
		scheduledExecutorService.schedule(task, 5, TimeUnit.SECONDS);
		
		System.out.println("Shutting down the executor");
		scheduledExecutorService.shutdown();
	}

}
