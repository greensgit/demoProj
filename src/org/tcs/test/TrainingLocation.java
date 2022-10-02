package org.tcs.test;

public class TrainingLocation {
	
	//ctrl+space and enter
	

	public static void main(String[] args) {
		
		String s = "Greens";
		String s2 = "greens";
		
		//length of String
		int l = s.length();
		System.out.println(l);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		int indexOf = s.indexOf("e");
		System.out.println(indexOf);
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		char charAt = s.charAt(3);
		System.out.println(charAt);
		boolean equals = s.equals(s2);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		boolean contains = s.contains("Een");
		System.out.println(contains);
	}
}
