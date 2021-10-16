package com.java;

public class String_Function {
	
	public static void main(String[] args) {
		
		String s = "welcome to java";
		
		// length()
		
		int length = s.length();
		System.out.println(length);
		
		// equals()
		
		boolean equals = s.equals("welcome to java");
		System.out.println(equals);
		
		// equalsIgnoreCase()
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("Welcome to java");		
		System.out.println(equalsIgnoreCase);
		
		// toUpperCase()
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		// toLowerCase()
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		// startsWith()
		
		boolean startsWith = s.startsWith("n");
		System.out.println(startsWith);
		
		// endsWith()
		
		boolean endsWith = s.endsWith("a");
		System.out.println(endsWith);
		
		// contains()
		
		boolean contains = s.contains("z");
		System.out.println(contains);
		
		// indexOf()
		
		int indexOf = s.indexOf('e');
		System.out.println(indexOf);
		
		
		// lastIndexOf()
		
		int lastIndexOf = s.lastIndexOf('e');
		System.out.println(lastIndexOf);
		
		// charAt()
		
		char charAt = s.charAt(6);
		System.out.println(charAt);
		
		// replace()
		
		String replace = s.replace("to", "for");
		System.out.println(replace);
		
		// subString()
		
		String substring = s.substring(6);
		System.out.println(substring);
		
		// isEmpty()
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		//split()
		
		String[] split = s.split("e");
		for (String string : split) {
			System.out.println(string);
		}
		
		// trim()
		
		String s1 = "    java   selenium      ";
		String trim = s1.trim();
		System.out.println(trim);
		
		
		//concat()
		
		String concat = s.concat(s1);
		System.out.println(concat);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
