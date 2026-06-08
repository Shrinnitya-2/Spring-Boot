package com.java8Practice.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumAverageListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(12,43,23,56,44,47,45,87,99,88);
		
		int sum = numbers.stream()
		.mapToInt(Integer::valueOf)
		.sum();
		
		System.out.println("Sum is:" +sum);
		
		OptionalDouble optavg = numbers.stream()
		.mapToDouble(Integer::doubleValue)
		.average(); //returns optionaldouble
		//System.out.println(optavg);
		
		if(optavg.isPresent()) {
			System.out.println("Averagae: "+optavg.getAsDouble());
		}
		
		int[] numarr = new int[] {12,43,23,56,44,47,45,87,99,88};
		
		System.out.println("Sum using arrays");
		int total = Arrays.stream(numarr).sum();
		System.out.println("Sum is "+total);
		
		System.out.println("Average using arrays");
		OptionalDouble optavgarr = Arrays.stream(numarr).average();
		//System.out.println(optavgarr);
		optavgarr.ifPresent(System.out::println);
		

	}

}
