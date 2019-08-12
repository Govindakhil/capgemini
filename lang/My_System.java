package capgemini.lang;

import capgemini.javabeans.EmployeeId;

public class My_System {

	public static void main(String[] args) {
		System system;
		//system = new System(); 		//can not be instantiated
		
		// currentTimeMili
		long startMemory = Runtime.getRuntime().freeMemory();
		long startTimeMillis = System.currentTimeMillis();
		
		System.out.println("Start Memory:" + startMemory);
		System.out.println("Start Time:" + startTimeMillis);
		
		//consuming memory...
		for(int index=0;index < 100000; index++) {
			new EmployeeId();
			
		}
		
		System.out.println("Last employee Id:" + EmployeeId.SEQUENCE);
		System.out.println("Total Employee Count:"+EmployeeId.COUNT);
		
		long endTimeMillis = System.currentTimeMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		
		System.out.println("end MemoryL:"+ endMemory);
		System.out.println("End Time:"+endTimeMillis);
		
		System.exit(0);
					
	}
}
