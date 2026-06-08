package com.java8Practice.Numbers;

import java.util.stream.IntStream;

public class EvenOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Even numbers list using range");
		IntStream.rangeClosed(20,50)
		.filter(num -> num%2==0)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("Odd numbers list using range");
		IntStream.rangeClosed(10,50)
		.filter(num -> num%2!=0)
		.sorted()
		.forEach(System.out::println);

	}

}
