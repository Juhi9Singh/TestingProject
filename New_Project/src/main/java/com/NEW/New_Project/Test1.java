package com.NEW.New_Project;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test1 {
	
	

	@Test(groups="e2e")
	public void signup1() {
		System.out.println("Hello1!!!!");
	}
	
	@Test(groups="smoke")
	public void signup2() {
		System.out.println("Hello2!!!!");
	}
	
	@Test(groups="regression")
	public void signup3() {
		System.out.println("Hello3!!!!");
	}
	
	@Test(groups="sanity")
	public void signup4() {
		System.out.println("Hello4!!!!");
	}
	
}
