package com.demoprojct;

public class HowToFindMaxAndMinValueInArray {

	public static void main(String[] args) {

    int a[] = {50, 30, 70, 40, 80,60};
    
    int max = a[0];
    
    for (int i=1 ;i<a.length ;i++){
    	
    	if(a[i]>max){
    		
    		max = a[i];
    	}
    }
    
    
    
	}

}
