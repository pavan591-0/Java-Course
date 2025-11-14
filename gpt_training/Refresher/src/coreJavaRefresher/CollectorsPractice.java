package coreJavaRefresher;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsPractice {

	public static void main(String[] args) {
		
		List<String> fruits = List.of(
			    "apple", "banana", "apple", "mango", "banana", "apple", "orange"
			);
		
		countFrequency(fruits);
		distinctFruits(fruits);
		joinList(fruits);
		distinctSetFruits(fruits);
	}

	private static void distinctSetFruits(List<String> fruits) {
		System.out.println(fruits.stream().collect(Collectors.toSet()));
	}

	private static void joinList(List<String> fruits) {
		System.out.println(fruits.stream().collect(Collectors.joining(",")));
	}

	private static void distinctFruits(List<String> fruits) {
		System.out.println(fruits.stream().distinct().collect(Collectors.toList()));
	}

	private static void countFrequency(List<String> fruits) {
		System.out.println(fruits.stream().collect(Collectors.groupingBy(f -> f, Collectors.counting())));
	}

}
