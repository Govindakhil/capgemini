package capgemini.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executor_Test_4 {	//task repeating.......
	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService =Executors.newScheduledThreadPool(1);
		
		Runnable task =new Runnable(){
			@Override
			public void run() {
				System.out.println("Executing Task At "+System.nanoTime());
			}
		};
		System.out.println("scheduling task to be executed "+" "+"every 2 seconds with an initial delay of 0 seconds");
		scheduledExecutorService.scheduleAtFixedRate(task,0, 2, TimeUnit.SECONDS);
	}

}
