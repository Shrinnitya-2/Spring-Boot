package com.java8Practice.Strings;

import java.util.stream.IntStream;

public class ReverseStringusingStringBuilder {

	public static void main(String[] args) {
		String str = "hello";
		String reverse = IntStream.range(0, str.length())
				.mapToObj(i -> str.charAt(str.length()-1-i))
				.map(String::valueOf)
				.reduce("", (a,b)->a+b);
		System.out.println(reverse);
	}

}
