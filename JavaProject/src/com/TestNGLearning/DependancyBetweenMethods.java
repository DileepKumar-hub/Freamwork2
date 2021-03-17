package com.TestNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyBetweenMethods {
	
	@Test
	public void LoginApp(){
		
		Assert.assertEquals("Actual", "expected");
		System.out.println("Login to application");
		
	}
	@Test(dependsOnMethods="LoginApp")
public void SelectItem(){
		
		System.out.println("Selecting the items");
		
	}
    @Test(dependsOnMethods="SelectItem")
public void LogOut(){
    	
   
	
	System.out.println("Logout from the App");
	
}

}
