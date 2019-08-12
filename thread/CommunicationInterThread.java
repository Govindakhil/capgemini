package capgemini.thread;

public class CommunicationInterThread {
	public static void main(String[] args) {
		System.out.println("CommInterthread->Started....");
		Account account =new Account();
		
		new Thread(){
			public void run() {
				account.withdraw(15000);
				}
			}.start();
		
	new Thread(){
		public void run() {
			account.deposit(10000);
			}
		}.start();
		
	System.out.println("CommInterthread->ended....");
	
	}
		
	}
class Account{
	int amount=10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if(this.amount<amount){
			System.out.println("Less balance: waiting for deposit...");
			try{
				wait();
			}catch(Exception e){
		}
	}
		this.amount = amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount+= amount;
		System.out.println("deposit completed...");
		notify();
	}
	
}


