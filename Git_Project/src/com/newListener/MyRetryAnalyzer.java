package com.newListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
	
	int count=0;
	int maxretry=4;
	
	public boolean retry(ITestResult result) {
		
		if(count<maxretry) {
			count++;
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
