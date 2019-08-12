package capgemini.collections;

import java.util.HashMap;
import java.util.Iterator;

public class _HashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		System.out.println("size:" + hashMap.size() + "\t" + hashMap);
		hashMap.put(null, null);
		hashMap.put(null, null); // allows only one null key
		hashMap.put(0, null); // allows many null values
		hashMap.put(1, "Jan"); // duplicate keys are not allowed
		hashMap.put(2, "Feb");
		hashMap.put(3, "Mar");
		System.out.println("size:" + hashMap.size() + "\t" + hashMap);

		// hashMap.iterator(); do not get iterator directly....
		Iterator<Integer> itrKeys = hashMap.keySet().iterator(); // iterator of keys
																	
		System.out.println("Printing keys....");
		while (itrKeys.hasNext()) {
			System.out.println(itrKeys.next());
		}

		Iterator<Integer> itrValues = hashMap.keySet().iterator(); // iterator of values
																	 
		System.out.println("Printing values....");
		while (itrValues.hasNext()) {
			System.out.println(itrValues.next());
		}

		System.out.println("Printing key:values....");
		Iterator<Integer> itrKeys2 = hashMap.keySet().iterator(); // iterator of key & values
																	
		System.out.println("Printing values....");
		while (itrKeys2.hasNext()) {
			Integer key = itrKeys2.next();
			System.out.println(key + ":" + hashMap.get(key));
		}

	}

}
