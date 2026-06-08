package com.java8Practice.Strings;

import java.util.stream.Collectors;

public class RemoveDuplicatesWithoutsb {
	public static void main(String args[]) {
	String str ="programming";
	String result = str.chars()
		.distinct()
		.mapToObj(c->String.valueOf((char)c))
				.collect(Collectors.joining());
		System.out.println(result);
}

}
