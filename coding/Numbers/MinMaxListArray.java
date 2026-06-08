package com.java8Practice.Numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class MinMaxListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(12,43,23,56,44,47,45,87,99,88);
		int maxn = numbers.stream()
				.max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("MAximum value: "+maxn);
		
		
		System.out.println("Max value using maptoint");
		maxn = numbers.stream()
				.mapToInt(Integer::valueOf)
				.max().getAsInt();
		System.out.println("MAximum value: "+maxn);
		
		System.out.println("Max value using sorted findfirst method");
		maxn = numbers.stream()
				.sorted((a,b) ->b-a)
				.findFirst().get();
		System.out.println("MAximum value: "+maxn);
		
		System.out.println("Minimum Value");
		int[] numarr = new int[] {12,43,23,56,44,47,45,87,99,88};
		
		OptionalInt minv =Arrays.stream(numarr).max();
		//System.out.println("MAximum value: "+minv);
		minv.ifPresent(System.out::println);

	}

}
