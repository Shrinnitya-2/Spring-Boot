package com.java8Practice.Strings;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "madam";
		boolean isPalindrome = true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
		

	}

}
