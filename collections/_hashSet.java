package capgemini.collections;

import java.util.HashSet;
import java.util.Iterator;

public class _hashSet {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		System.out.println("size:"+hashSet.size()+"\t"+hashSet);
		hashSet.add("Jan");
		hashSet.add("Jan");  //no duplicates are allowed
		hashSet.add(null);
		hashSet.add(null);	//only one null is allowed
		hashSet.add("Feb");
		hashSet.add("Mar");		//insertion order is not maintained..
		System.out.println("size:"+hashSet.size()+"\t"+hashSet);
		
		hashSet.remove("Mar");
		System.out.println("size:"+hashSet.size()+"\t"+hashSet);
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//enhanced for loop....
				for(String value:hashSet) {
					System.out.println(value);
				}
	}

	}
