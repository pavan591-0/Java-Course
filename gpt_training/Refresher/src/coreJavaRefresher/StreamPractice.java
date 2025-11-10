package coreJavaRefresher;

import java.util.Arrays;
import java.util.List;


public class StreamPractice {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(5, 12, 7, 3, 18, 9, 21, 14);
		
		printEvenNumbers(data);
		
		System.out.println("\nNumbers greater than 10: ");
		printNumbersGreaterThan(data, 10);
		
		System.out.println("\nSum of all numbers: "+totalSum(data));
		
		System.out.println("\nMaximum number: "+maxNumOfList(data));
		
	}
	
	private static void printEvenNumbers(List<Integer> data) {
		System.out.println("Even numbers: ");
		data.stream()
			.filter(num -> num%2 == 0)
			.forEach(System.out::println);
		
	}
	
	private static void printNumbersGreaterThan(List<Integer> data, int n) {
		data.stream()
		.filter(num -> num> n)
		.forEach(System.out::println);
		
	}
	
	private static int totalSum(List<Integer> data) {
		return data.stream()
				.reduce(0, Integer::sum);
		
	}
	
	private static int maxNumOfList(List<Integer> data) {
		
		return data.stream()
				.max(Integer::compareTo)
				.orElse(Integer.MIN_VALUE);
		
	}
}
