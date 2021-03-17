package com.demoprojct;

public class ReversingString {

	public static void main(String[] args) {


		String str = "ABCDEFGH";
		String rev = "";
		
		//1.Using + (String concatenation) operator
		/* int len = str.length();
		 
		 for (int i=len-1 ; i>=0 ; i--){
			 
			  rev = rev+str.charAt(i);
			  
		 }
		 
		  System.out.println("value of reverse string is: " + rev);*/
		
		//2. Using char array
		
		/*char a[] = str.toCharArray();
		int len = str.length();
				
		
		for (int i=len-1 ;i>=0 ;i--){
			
			rev = rev+a[i];
			
			
		}
         
		System.out.println(" Reverse string is: " +rev);*/
		
		//3.Using StingBuffer class
		
		StringBuffer sb = new StringBuffer(str);
		
		String reverse = rev+sb.reverse();
		
		System.out.println("Reverse string is: " + reverse);
		
		
		
	}

}
