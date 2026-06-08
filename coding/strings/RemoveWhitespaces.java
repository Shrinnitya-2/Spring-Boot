package com.java8Practice.Strings;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		String str = " ja va str  eam ";
		String whitespaces = str.replaceAll("\\s", "");
		System.out.println(whitespaces);

	}

}
