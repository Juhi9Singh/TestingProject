package com.NEW.New_Project;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1, description="signup details", invocationCount= 1, groups={"regression", "sanity", "e2e"})
	public void signUp() {
		System.out.println("signup details...");
	}
	//@Ignore
	@Test(priority=2, groups={"regression", "sanity", "e2e"})
	public void login() {
		System.out.println("login details...");
	}
	
	@Test(priority=3, description="selecting shoes category", groups={"regression", "e2e"})
	public void shoesCategory() {
		System.out.println("selecting shoes category...");
	}
	
	@Test(priority=4, enabled=true, timeOut= 20000, groups={"regression"})
	public void addToCart() throws InterruptedException{
		//Thread.sleep(21000);
		System.out.println("adding product to cart...");
	}
	
	@Test(priority=5, enabled=true, groups={"regression", "sanity", "e2e"})
	public void shippingDetails() {
		System.out.println("filling shipping details...");
	}
	
	@Test(priority=6, groups={"sanity", "e2e"})
	public void payment() {
		System.out.println("make payment using credit card...");
	}
	
	@Test(priority=7, groups={"regression", "e2e"})
	public void track() {
		System.out.println("tracking order...");
	}
	
	@Test(priority=8, groups={"regression", "sanity", "e2e"})
	public void review() {
		System.out.println("review and rating of product...");
	}


}
