package capgemini.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class _TreeSet {
	public static void main(String[] args) {
		TreeSet<String> treeSet= new TreeSet<String>();
		System.out.println("size:"+treeSet.size()+"\t"+treeSet);
		
		//treeSet.add(null);	//not allowed
		treeSet.add("A");
		treeSet.add("A");		//duplicate value is not allowed
		treeSet.add("C");		//insertion order is not maintained..
		treeSet.add("B");		//sorts values on insertion
		System.out.println("size:"+treeSet.size()+"\t"+treeSet);
		
		Iterator<String> iterator = treeSet.iterator();
		System.out.println("Printing in ascending order....");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("Printing in descending order....");
		Iterator<String> descendingIterator = treeSet.descendingIterator();
		while(descendingIterator.hasNext()){
			System.out.println(descendingIterator.next());
		}
	}

}
