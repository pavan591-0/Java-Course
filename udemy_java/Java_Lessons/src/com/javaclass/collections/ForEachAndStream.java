package com.javaclass.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachAndStream {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Pavan", "Joey", "Erin", "Mikasa", "Eren", "naruto", "Luffy");
		
		System.out.println("Printing all the names using for each:");
		
//		Consumer con = n -> System.out.println(n);
//		names.forEach(con);
		
		names.forEach(n -> System.out.println(n));
		
		System.out.println("Now Printing the characters names which has an odd length using streams:");
		
		Stream<String> odd_len_names = names.stream()
											.filter(n -> n.length() % 2 != 0);
		
		odd_len_names.forEach(n -> System.out.println(n));
		
	}
	
}
