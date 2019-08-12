package capgemini.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class _ArrayList {
	public static void main(String[] args) {
				
		
		ArrayList list=new ArrayList();
		list.add(1);
		list.add("One");
		list.add(true);
		list.add(75.5f);
		
		// indexed based
		for(int index=0;index<list.size();index++){
			System.out.println(list.get(index));
		}
	 //enhanced for loop
		for(Object obj:list){
			System.out.println(obj);
		}
		//Using Iterator
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			Object obj=iterator.next();
			System.out.println(obj);
		}
	}

}
