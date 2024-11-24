package com.javaclass.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamExample {

	public static void main(String[] args) {

		int size = 10000;
		
		List<Integer> nums = new ArrayList<>(size);
		
		Random rand = new Random();
		
		for(int i = 0; i < size; i++) nums.add(rand.nextInt(100));
		
		long startSeq = System.currentTimeMillis();
		
		int value1 = nums.stream()
						.map(n ->{
							try {
								Thread.sleep(1);
							}catch(Exception e) {}
							return n * 2;
						})
						.mapToInt(n -> n)
						.sum();
		
		long endSeq = System.currentTimeMillis();
		
		long startPara = System.currentTimeMillis();
		int value2 = nums.parallelStream()
						.map(n ->{
							try {
								Thread.sleep(1);
							}catch(Exception e) {}
							return n * 2;
						})
						.mapToInt(n -> n)
						.sum();
		long endPara = System.currentTimeMillis();
		
		System.out.println("Value1: "+ value1 + " Time: " +(endSeq - startSeq));
		System.out.println("Value2: "+ value2 + " Time: " +(endPara - startPara));
		
		

	}

}
