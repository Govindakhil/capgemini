package capgemini.thread;

public class JoiningThread {
	public static void main(String[] args) {
		System.out.println("joiningThread->started..");
		
		Thread T1=new ExtendedThread("T1");
		Thread T2=new ExtendedThread("T2");
		
		System.out.println("T1 has started...");
		T1.start();
		
		try {
			System.out.println("T1 join....");
			T1.join();
			System.out.println("T1 is done....");
		} catch (InterruptedException e) {
			
			System.err.println(T1.getName()+"Interrupted...");
		}
		
		System.out.println("T2 has Started...");
		T2.start();
		try {
			System.out.println("T2 join....");
			T2.join();
			System.out.println("T2 is done....");
		} catch (InterruptedException e) {
			System.err.println(T2.getName()+"Interrupted...");
		}
		System.out.println("Main has started...");
		for(int index=0;index<10;index++)
		{
			System.out.println("\t"+Thread.currentThread().getName()+":->"+index);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
