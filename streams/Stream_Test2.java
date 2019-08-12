package capgemini.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_Test2 {
public static void main(String[] args) {

	Integer[] nums=new Integer[10];
	for(int index=0;index<nums.length;index++){
		nums[index]=(int)(Math.random()*100);
	}
	
	
	nums=new Integer[] {1,2,3,4,5,5,4,3,2,1};

		//obtaining a stream 
	Stream<Integer> stream0 =Arrays.stream(nums);
	
		//consumer -> Lambda Expression
	//stream0.forEach((value) -> System.out.print(value));
	
		//stream0.forEach(System.out::println(value);
	
	//stream0.forEach(System.out::println); 	//Method Reference
	
	//stream0.distinct().forEach(System.out::println); 
	
	//stream0.distinct().limit(3).forEach(System.out::println); 
	
	//print odd numbers only
	
	//Predicate<Integer> oddPredicate = (value) -> value%2 ==0;
	//stream0.filter(oddPredicate).forEach(System.out::println);
	
	//long count = stream0.count(); 
	
	//print min
	//stream0.sorted().limit(1).forEach(System.out::println); 
	//long min =stream0.min
	
	//print max
	Comparator<Integer> comp =(num1,num2)->(num1>num2?1:num2>num1?-1:0);
	Optional<Integer> optionalMax =stream0.max(comp);
	System.out.println(optionalMax.get()); 	
	
} 
}
