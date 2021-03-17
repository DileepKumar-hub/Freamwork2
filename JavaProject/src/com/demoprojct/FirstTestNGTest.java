package com.demoprojct;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FirstTestNGTest {

	
	
	@Test(priority=1)
	public void TestNgTest(){
		
		Assert.assertEquals(12, 16);
		
		System.out.println("This is my first Testng Test");
		
	}
	
	@Test(priority=2,description="This test case validate the login of the application")
	public void LoginApp(){
		
		
		System.out.println("Login to application");
		
	}
	
	@Test(priority=3,description="This test case validates selection of items")
	public void SelectItem(){
		
		
		System.out.println("Selected items in the application");
		
	}
	
	@Test(priority=4,description="This test case validates checkout of application")
	public void Checkout(){
		
		
		System.out.println("Checkout from the application");
		
	}

}
