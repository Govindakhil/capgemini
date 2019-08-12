package capgemini.streams;

import java.util.Arrays;
import java.util.List;

public class MappingStream {
	public static void main(String[] args) {
	
		List<String> locations =Arrays.asList(new String[] {"Pune","Mumbai","Chennai","Banglore","Noida"});
		System.out.println("Word length for locations: ");
		locations.stream().map(String::length).forEach(System.out::print);
		
		//locations.stream().map(city::new).forEach(System.out::print);
	}

}
