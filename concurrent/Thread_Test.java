package capgemini.concurrent;

public class Thread_Test {
	public static void main(String[] args) {
		
		//1.Implementing Runnable Interface
		Runnable runnable1 =new HelloRunnable();
		Thread runnableThread =new Thread(runnable1);
		runnableThread.start();
	
		//2.Implements Anonymous class
		Runnable runnable2 =new Runnable(){
			@Override
			public void run() {
				System.out.println("Hello Anonymous....");
			
			}
		};
		Thread anonymousThread = new Thread(runnable2);
		anonymousThread.start();
		
		//3.Implementing Lambda Expression
		Runnable runnable3=()->System.out.println("Hello Lambda");
		Thread lambdaThread1 =new Thread(runnable3);
		lambdaThread1.start();
		
		Thread lambdaThread2 =new Thread(()-> System.out.println("Lambda WOW!"));
		lambdaThread2.start();
	}

}

class HelloRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello Runnable");
	}
}