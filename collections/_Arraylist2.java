package capgemini.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class _Arraylist2 {
	public static void main(String[] args) {
		//ArrayList<String> list=new ArrayList<String>(3);
		//LinkedList<String> list =new LinkedList<String>();
		Vector<String> list= new Vector<String>();
		System.out.println("size:"+list.size()+"\t"+list);
		list.add(null);
		list.add(null);  //multiple null are allowed
		list.add("Sun");
		list.add("Mon");
		list.add("Wed");
		System.out.println("size:"+list.size()+"\t"+list);
		
		//added based on index
		list.add(2,"Tue");
		System.out.println("Size:"+list.size()+"\t"+list);
		list.add("Thus");
		list.add("Free");
		list.add("Sat");
		list.add("Soon");
		System.out.println("size:"+list.size()+"\t"+list);
		
		int index= list.indexOf("Free");
		if(index!=1){
			list.set(index, "Fri");  //modified a value
		}
		
		if(list.contains("Free")){
			list.set(list.indexOf("Free"), "Fri");
			System.out.println("size:"+list.size()+"\t"+list);
		}
		
		//searched a String
		/*if(list.contains("Free"))
			list.set(5, "Fri");  //modified a value
		System.out.println("size:"+list.size()+"\t"+list);
		*/
		if(list.contains("Soon"))
			list.remove("Soon");  //removed a value
		System.out.println("size:"+list.size()+"\t"+list);
		
		//iterating
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//enhanced for loop....
		for(String value:list) {
			System.out.println(value);
		}
		
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext())
		{
			listIterator.next();
		}
		while(listIterator.hasPrevious()){
			System.out.println("*"+listIterator.previous());
		}
	}

}
