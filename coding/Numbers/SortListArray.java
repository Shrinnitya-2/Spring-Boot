package com.java8Practice.Numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortListArray {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,43,23,56,44,47,45,87,99,88);
		System.out.println("Sorting using list");
		 numbers.stream()
		 //.sorted((a,b) ->b-a) //descending order
		 .sorted(Comparator.comparing(Integer::valueOf)) //ascending order
		 //.sorted(Comparator.comparing(Integer::intValue).reversed()) //descending order
		 .forEach(System.out::println);
		 
		 int[] numsarr = new int[] {12,43,23,56,44,47,45,87,99,88};
		 System.out.println("Sorting using arrays");
		  Arrays.stream(numsarr)
		 .mapToObj(Integer::valueOf) // ascending order
		 //mapToObj--- converts from primitive streams to object streams Integer->int mapToObj---Stream<Objects>
		 //.sorted((a,b)->b-a) //descending order
		 .forEach(System.out::println);
		  
		  
		  System.out.println("Sorting with the help of Primitive datatype");
		  Arrays.stream(numsarr)
			 .boxed()
			 //.sorted((a,b) -> b-a) //descendign order
			 .mapToInt(num->(Integer.valueOf(num))) //ascending order mapToInt-->Streeam<Integer> vlaues
			 .forEach(System.out::println);
		 
		  System.out.println("Descending order Sorting with the help of Primitive datatype");
		  Arrays.stream(numsarr)
			 //.boxed()
			 //.sorted((a,b) -> b-a) //descendign order
			 .mapToObj(num->(Integer.valueOf(num))) //ascending order
			 .sorted(Comparator.comparingInt(Integer::intValue).reversed())
			 .forEach(System.out::println);
		 

	}

}
