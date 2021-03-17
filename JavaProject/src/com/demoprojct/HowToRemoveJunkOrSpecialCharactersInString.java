package com.demoprojct;

public class HowToRemoveJunkOrSpecialCharactersInString {

	public static void main(String[] args) {


		String str = "@#$@$#@$#fsfsafsfsfwerw#@66663322#@";
		
		String s=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("After Removing the junk is:" + s);
		
		
	}

}
