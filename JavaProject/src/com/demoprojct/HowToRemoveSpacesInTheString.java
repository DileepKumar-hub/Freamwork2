package com.demoprojct;

public class HowToRemoveSpacesInTheString {

	public static void main(String[] args) {
		
		String str = "Selenium   Automation  Learning";
		
		String s = str.replaceAll("[^a-zA-Z]", "");
		
		System.out.println("String after removing all spaces is: " +s);
		
	}

}
