package capgemini.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_Lambda_Expression {
	public static void main(String[] args) {
		/*Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable....");
			}
		};*/
		
		
		
		/*Callable<String> callable=new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				System.out.println("Callable....");
				return "Callable Done";
			}
		}; */
		
		//Implements runnable -> LambdaExpression......
		Runnable runnable= () -> System.out.println("Lambda -> Runnable....");
		Thread Thread =new Thread(runnable);
		Thread.start();
		
		//passing implementation as function argument....
		
		/*Thread thread=new Thread(() ->System.out.println("Lambda -> Runnable...."));
		thread.start();
		*/
		
		//Implements callable -> LambdaExpression......
		Callable<String> callable=() ->{
			System.out.println("Callable....");
			return "Callable Done";
		};
		
		ExecutorService executorService= Executors.newSingleThreadExecutor();
		executorService.submit(callable);
		executorService.shutdown();
		
		
	}

}
