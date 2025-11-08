package com.javaclass.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

class Person1 {
	private String name;
	private int age;

	// Constructor
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Default Constructor
	public Person1() {
		this.name = "Unknown";
		this.age = 0;
	}

	// Getter and Setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
}

public class OptionalMethodAndConstructorRef {
	public static void main(String[] args) {
		List<Person1> people = new ArrayList<>();
		people.add(new Person1("Alice", 30));
		people.add(new Person1("Bob", 25));
		people.add(new Person1("Charlie", 35));

		// Using Optional to safely find a person by name
		String searchName = "Bob";
		Optional<Person1> optionalPerson = people.stream().filter(person -> person.getName().equals(searchName))
				.findFirst();

		// Method Reference for Optional.ifPresent
		optionalPerson.ifPresent(System.out::println);

		// Handling Optional with orElseGet using a Constructor Reference
		Person1 foundPerson = optionalPerson.orElseGet(Person1::new);
		System.out.println("Found person (or default): " + foundPerson);

		// Static Method Reference (to print all names)
		System.out.println("\nAll names:");
		people.stream().map(Person1::getName) // Method reference for instance method
				.forEach(System.out::println);

		// Using Constructor Reference to create a new Person
		Supplier<Person1> personSupplier = Person1::new;
		Person1 newPerson = personSupplier.get();
		System.out.println("\nNew person created using constructor reference: " + newPerson);
	}
}
