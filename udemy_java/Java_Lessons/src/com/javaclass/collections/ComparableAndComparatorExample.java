package com.javaclass.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Class implementing Comparable
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        // Natural order: Compare by age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ComparableAndComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort using Comparable (natural order by age)
        Collections.sort(people);
        System.out.println("People sorted by age (natural order):");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort using Comparator (custom order by name)
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Collections.sort(people, nameComparator);
        System.out.println("\nPeople sorted by name (custom order):");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort using Comparator (custom order by age in descending order)
        Comparator<Person> ageDescendingComparator = (p1, p2) -> Integer.compare(p2.getAge(), p1.getAge());
        Collections.sort(people, ageDescendingComparator);
        System.out.println("\nPeople sorted by age (descending order):");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

