package com.demoprojct;

public class RemovingDuplicateValue {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String arr[] = {"Java", "Python", "Python", "C++", "Java", "C", "Python"};
		boolean flag=false;
		
		for (int i=0 ;i<arr.length ;i++){
			
			for (int j=i+1 ;j<=arr.length ;j++) {
				
				if (arr[i]==arr[j]){
					
					System.out.println("Duplicate value found is: " + arr[i]);
					flag = true;
				}
			}
		}
		
		System.out.println("Duplicate value not found");
		flag=false;
		
		
	}

}
