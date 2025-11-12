package coreJavaRefresher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTransformations {
	
	public static final int MIN_LENGTH = 4;

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(List.of(" eren ", "MIKASA", "Levi", "sAsUke ", "GOKU"));
		
		System.out.println("-----------------String Manipulations--------------------");
		System.out.println("\nTrim Spaces: ");
		trimSpaces(names);
		System.out.println("\nNames in lower case:");
		convertToLowerCase(names);
		System.out.println("\nNames in Capitalized form:");
		capitalization(names);
		System.out.println("\nFiltering names greater than length "+MIN_LENGTH);
		filterNamesByNCharacters(names, MIN_LENGTH);
		System.out.println("\nSorted names alphabetically...........");
		sortNamesAlphabetically(names);

	}

	private static void sortNamesAlphabetically(List<String> names) {
		List<String> sortedList = convertLowerAndTrimSpaces(names).sorted().collect(Collectors.toList());
		for(String name: sortedList) {
			System.out.println(name);
		}
	}

	private static void filterNamesByNCharacters(List<String> names, int minLength) {
		convertLowerAndTrimSpaces(names)
		.filter(name -> name.length() > minLength)
		.forEach(System.out::println);
	}

	private static void capitalization(List<String> names) {
		convertLowerAndTrimSpaces(names)
		.map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
		.forEach(System.out::println);
	}

	private static void convertToLowerCase(List<String> names) {
		convertLowerAndTrimSpaces(names)
		.forEach(System.out::println);
	}

	private static void trimSpaces(List<String> names) {
		names.stream().map(String::trim).forEach(System.out::println);
	}
	
	private static Stream<String> convertLowerAndTrimSpaces(List<String> names) {
		return names.stream().map(String::trim).map(String::toLowerCase);
	}

}
