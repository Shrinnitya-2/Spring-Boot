package com.java8Practice.Strings;

public class RemoveSplChars {
	public static void main(String args[]) {
		String str = "@j#a%va*S%tr#$ea^m";
		String removesplchars = str.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(removesplchars);
	}

}
