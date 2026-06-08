package com.java8Practice.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSet {
	public static void main(String args[]) {
	String str ="programming";
	StringBuilder sb = new StringBuilder();
	Set<Character> set = new LinkedHashSet();
	for(int i=0;i<str.length();i++) {
		set.add(str.charAt(i));
	}for(Character c:set) {
		sb.append(c);
	}
	System.out.println(sb);
}

}
