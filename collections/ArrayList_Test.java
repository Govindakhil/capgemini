package capgemini.collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList_Test {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		String str="hi";
		list.add("String");
		list.add(str);
		list.add(str +str);
		System.out.println(list.toString());
		System.out.println(list.size());
		System.out.println(list.contains(42));
		System.out.println(list.contains("hihi"));
		list.remove("hi");
		System.out.println(list.size());
		System.out.println(list.toString());
	
	Iterator<String> iterator = list.iterator();
	while(iterator.hasNext()){
		Object obj=iterator.next();
		System.out.println(obj);
	}
}

}
