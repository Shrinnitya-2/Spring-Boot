package com.java8Practice.Numbers;

import java.util.Arrays;
import java.util.List;

public class EvenOddListArray {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,43,23,56,44,47,45,87,99,88);
		System.out.println("Even numbers list using List");
		numbers.stream()
		.filter(num -> num%2==0)
		.sorted()
		.forEach(System.out::println);
		
		
		System.out.println("Odd numbers list using List");
		numbers.stream()
		.filter(num -> num%2 !=0)
		.sorted().
		forEach(System.out::println);
		
		
		int[] numarr = new int[] {12,43,23,56,44,47,45,87,99,88};
		System.out.println("Even numbers list using Array");
		Arrays.stream(numarr)
		.filter(num -> num%2==0)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("Odd numbers list using Array");
		Arrays.stream(numarr)
		.filter(num -> num%2!=0)
		.sorted()
		.forEach(System.out::println);

	}

}
