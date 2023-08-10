package com.NEW.New_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sign {
	
	
	/*
	 * @BeforeSuite public void beforeSuite() {
	 * System.out.println("beforesuite will execute first..."); }
	 * 
	 * @BeforeTest public void beforeTest() {
	 * System.out.println("then beforetest will execute..."); }
	 * 
	 * 
	 * 
	 * @BeforeClass public void beforeClass() {
	 * System.out.println("then beforeclass will execute..."); }
	 * 
	 * @BeforeMethod public void beforeMethod() {
	 * System.out.println("then beforemethod will execute..."); }
	 */
	
	@Test(priority=1, description="signup details", invocationCount= 1)
	public void signUp() {
		System.out.println("signup details...");
	}
	//@Ignore
	@Test(priority=2, dependsOnMethods= {"signUp"})
	public void login() {
		System.out.println("login details...");
	}
	
	@Test(priority=3, description="selecting shoes category", dependsOnMethods= {"login"})
	public void shoesCategory() {
		System.out.println("selecting shoes category...");
	}
	
	@Test(priority=4, enabled=true, timeOut= 20000, dependsOnMethods= {"shoesCategory"})
	public void addToCart() throws InterruptedException{
		//Thread.sleep(21000);
		System.out.println("adding product to cart...");
	}
	
	@Test(priority=5, enabled=true, dependsOnMethods= {"addToCart"})
	public void shippingDetails() {
		System.out.println("filling shipping details...");
	}
	
	@Test(priority=6, dependsOnMethods= {"shippingDetails"})
	public void payment() {
		System.out.println("make payment using credit card...");
	}
	
	@Test(priority=7, dependsOnMethods= {"payment"})
	public void track() {
		System.out.println("tracking order...");
	}
	
	@Test(priority=8, dependsOnMethods= {"track"})
	public void review() {
		System.out.println("review and rating of product...");
	}
	
	/*
	 * @AfterMethod public void afterMethod() {
	 * System.out.println("after method will execute at last..."); }
	 * 
	 * @AfterClass public void afterClass() {
	 * System.out.println("then after class will execute..."); }
	 * 
	 * 
	 * 
	 * @AfterTest public void afterTest() {
	 * System.out.println("then after test will execute..."); }
	 * 
	 * @AfterSuite public void afterSuite() {
	 * System.out.println("then after suite will execute..."); }
	 */
	

}
