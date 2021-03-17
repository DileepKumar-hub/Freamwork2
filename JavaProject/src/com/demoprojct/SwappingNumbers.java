package com.demoprojct;

public class SwappingNumbers {

	public static void main(String[] args) {
 
		int a=10, b=20;
		
		System.out.println("Numbers before swapping.. "+a+" " +b);
		
		// using a third variable
		/*int t=a;
		a=b;
		b=t;*/
		
		//Using + & - without using third variable
		
		/*a = a+b;
		b = a-b;
		a = a-b;*/
		
		//using * and / operator without using third variable
				
		a = a*b;
		b = a/b;
		a = a/b;
		
		
		System.out.println("Numbers ofter swapping "+a+" " +b);
	}

}
