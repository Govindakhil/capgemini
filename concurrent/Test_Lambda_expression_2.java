package capgemini.concurrent;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_Lambda_expression_2 {
	public static void main(String[] args) {
		List<String> weekDays = Arrays.asList("Sun", "Mon", "Tue", "Wed");
		System.out.println("Natural Order: " + weekDays);

		Collections.sort(weekDays);
		System.out.println("Ascending Order: " + weekDays);

		Comparator<String> descComparator = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return str2.compareTo(str1);
			}
		};
		Collections.sort(weekDays, descComparator);
		System.out.println("Descending Order: " + weekDays);

		Comparator<String> descComparator1 = (String str1, String str2) -> {
			return str2.compareTo(str1);
		};

		Collections.sort(weekDays, descComparator1);
		System.out.println("Descending Order: " + weekDays);

		// printASC(weekDays,descComparator0);
		printASC(weekDays, (String str1, String str2) -> {
			return str2.compareTo(str1);
		});

		// forEach
		// Lambda usage in iteration of collection
		for (String day : weekDays) {
			System.out.println(day);
		}

		// passing Consumer interface implementation as Lambda Expression
		// to forEach loop
		weekDays.forEach((day) -> System.out.println(day));

		// passing Consumer interface implementation as Method Reference
		// to forEach loop
		weekDays.forEach(System.out::println);
	}

	
	
	
	
	
	private static void printASC(List<String> weekDays, Comparator<String> descComparator0) {

		Collections.sort(weekDays, descComparator0);
		System.out.println("Descending Order: " + weekDays);
	}

}
