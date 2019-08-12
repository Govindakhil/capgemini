package capgemini.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {

		HashMap<Integer, String> weekDays = new HashMap<Integer, String>();
		weekDays.put(1, "Monday");
		weekDays.put(2, "Tuesday");
		weekDays.put(3, "Wednesday");
		weekDays.put(4, "Thursday");
		weekDays.put(5, "Friday");
		weekDays.put(6, "Saturday");
		weekDays.put(7, "Sunday");
		System.out.println(weekDays.size() + "\t" + weekDays);

		boolean containskey = weekDays.containsKey(5);
		boolean containsValue = weekDays.containsValue("Friday");
		System.out.println("Contains Key: " + containskey);
		System.out.println("Contains Value: " + containsValue);

		String day = weekDays.get(5);
		System.out.println("Printing-> weekdays.get");
		System.out.println("Day: " + day);

		weekDays.remove(5);
		System.out.println(weekDays.size() + "\t" + weekDays);

		weekDays.put(5, "Friday");
		System.out.println(weekDays.size() + "\t" + weekDays);

		// printing key : value
		System.out.println("\nPrinting using forEach");
		weekDays.forEach((key, value) -> System.out.println(key + ":" + value));

		// printing key
		System.out.println("\nPrinting -> weekDays.keyset");
		Set<Integer> keyset = weekDays.keySet();
		keyset.forEach((key) -> System.out.print(key + " "));

		// printing values
		System.out.println("\nPrinting -> weekDays.values");
		Collection<String> values = weekDays.values();
		values.forEach(System.out::print);

		Set<Entry<Integer, String>> entrySet = weekDays.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		System.out.println("\nPrinting -> weekDays.entrySet");
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println("key: " + entry.getKey() + " : " + "Value:" + entry.getValue());
		}
	}
}
