package com.javaclass.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class BasicColllections {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(54); nums.add(32); nums.add(69); nums.add(81); nums.add(2, 45);
		
		System.out.println(nums);
		if(nums.contains(81)) System.out.println("Found 81 in the List");
		
		Set<Integer> nums1 = new HashSet<>();
		nums1.add(32); nums1.add(8); nums1.add(72); nums1.add(78); nums1.add(382); nums1.add(890);
		System.out.println(nums1.size() + " " +nums1);
		
		Set<Integer> nums2 = new TreeSet<>();
		nums2.add(32); nums2.add(8); nums2.add(72); nums2.add(78); nums2.add(382); nums2.add(890);
		System.out.println(nums2.size() + " " +nums2);
		
		Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the Map
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 2);

        // Display the Map
        System.out.println("Map: " + map);

        // Retrieve a value using a key
        String keyToSearch = "Banana";
        if (map.containsKey(keyToSearch)) {
            System.out.println(keyToSearch + " is present, Quantity: " + map.get(keyToSearch));
        } else {
            System.out.println(keyToSearch + " is not found.");
        }

        // Iterate through the Map
        System.out.println("\nIterating through the Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing an element by key
        map.remove("Cherry");
        System.out.println("\nMap after removing Cherry: " + map);
		

	}

}
