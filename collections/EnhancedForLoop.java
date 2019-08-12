package capgemini.collections;

import java.util.ArrayList;

class EnhancedForLoop {
	static void printArray(int intArr[]){
		for(int arrayindex:intArr)
			System.out.println(arrayindex);
	}
	static void printCollection(ArrayList arrList){
		for(Object object: arrList)
			System.out.println(object);
	}
	public static void main(String[] args) {
		int intArr[]={1,2,3,4,5};
		printArray(intArr);
		ArrayList arraylist=new ArrayList();
		arraylist.add(10);
		arraylist.add(30);
		arraylist.add(20);
		arraylist.add("capgemini");
		printCollection(arraylist);
		}

}
