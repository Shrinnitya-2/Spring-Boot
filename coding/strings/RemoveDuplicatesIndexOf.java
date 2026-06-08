package com.java8Practice.Strings;

public class RemoveDuplicatesIndexOf {
	public static void main(String args[]) {
	String str ="programming";
	StringBuilder sb = new StringBuilder();
	
	for(int i=0;i<str.length();i++) {
		char ch= str.charAt(i);
		int index = str.indexOf(ch, i+1);
		
		if(index== -1) {
			sb.append(ch);
		}
		
	}
	System.out.println(sb);
	
}

}
