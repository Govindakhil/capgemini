package capgemini.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collection {
	public static void main(String[] args) {
		
		List<String> cities =new ArrayList<>();
		cities.add("Pune");
		cities.add("Banglore");
		cities.add("Pune");
		cities.add("Chennai");
		
		
		
		cities.stream().distinct().forEach(city->System.out.println(city));
		
		
		
		List<String> collect =cities.stream().distinct().collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
		List<String> list =cities.stream().collect(Collectors.toList());
		
		System.out.println(list);
		
		
		
		Set<String> set =cities.stream().collect(Collectors.toSet());
		
		System.out.println(list);
		
		
		
		//cities.parallelStream().forEach(Sytem.out::Println);
		//cities.stream().distinct().
		
		//cities.forEach(Sytem.out::Println);
	}

}
