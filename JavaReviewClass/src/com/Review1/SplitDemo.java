package com.Review1;

public class SplitDemo {
	public static void main(String[] args) {
		String str="Syntax Technologies";
		char letter= str.charAt(5);
		System.out.println(letter);
		System.out.println(str.charAt(str.length()-1));
		//split
		String myString="Java classes at Syntax are awesome";
		String[] array=myString.split("a");
		System.out.println(array.length);
		
	}
	

}
